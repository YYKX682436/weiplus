package io.flutter.plugin.editing;

/* loaded from: classes13.dex */
public class SpellCheckPlugin implements io.flutter.embedding.engine.systemchannels.SpellCheckChannel.SpellCheckMethodHandler, android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener {
    public static final java.lang.String END_INDEX_KEY = "endIndex";
    private static final int MAX_SPELL_CHECK_SUGGESTIONS = 5;
    public static final java.lang.String START_INDEX_KEY = "startIndex";
    public static final java.lang.String SUGGESTIONS_KEY = "suggestions";
    private final io.flutter.embedding.engine.systemchannels.SpellCheckChannel mSpellCheckChannel;
    private android.view.textservice.SpellCheckerSession mSpellCheckerSession;
    private final android.view.textservice.TextServicesManager mTextServicesManager;
    io.flutter.plugin.common.MethodChannel.Result pendingResult;

    public SpellCheckPlugin(android.view.textservice.TextServicesManager textServicesManager, io.flutter.embedding.engine.systemchannels.SpellCheckChannel spellCheckChannel) {
        this.mTextServicesManager = textServicesManager;
        this.mSpellCheckChannel = spellCheckChannel;
        spellCheckChannel.setSpellCheckMethodHandler(this);
    }

    public void destroy() {
        this.mSpellCheckChannel.setSpellCheckMethodHandler(null);
        android.view.textservice.SpellCheckerSession spellCheckerSession = this.mSpellCheckerSession;
        if (spellCheckerSession != null) {
            spellCheckerSession.close();
        }
    }

    @Override // io.flutter.embedding.engine.systemchannels.SpellCheckChannel.SpellCheckMethodHandler
    public void initiateSpellCheck(java.lang.String str, java.lang.String str2, io.flutter.plugin.common.MethodChannel.Result result) {
        if (this.pendingResult != null) {
            result.error("error", "Previous spell check request still pending.", null);
        } else {
            this.pendingResult = result;
            performSpellCheck(str, str2);
        }
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public void onGetSentenceSuggestions(android.view.textservice.SentenceSuggestionsInfo[] sentenceSuggestionsInfoArr) {
        if (sentenceSuggestionsInfoArr.length == 0) {
            this.pendingResult.success(new java.util.ArrayList());
            this.pendingResult = null;
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.view.textservice.SentenceSuggestionsInfo sentenceSuggestionsInfo = sentenceSuggestionsInfoArr[0];
        if (sentenceSuggestionsInfo == null) {
            this.pendingResult.success(new java.util.ArrayList());
            this.pendingResult = null;
            return;
        }
        for (int i17 = 0; i17 < sentenceSuggestionsInfo.getSuggestionsCount(); i17++) {
            android.view.textservice.SuggestionsInfo suggestionsInfoAt = sentenceSuggestionsInfo.getSuggestionsInfoAt(i17);
            int suggestionsCount = suggestionsInfoAt.getSuggestionsCount();
            if (suggestionsCount > 0) {
                java.util.HashMap hashMap = new java.util.HashMap();
                int offsetAt = sentenceSuggestionsInfo.getOffsetAt(i17);
                int lengthAt = sentenceSuggestionsInfo.getLengthAt(i17) + offsetAt;
                hashMap.put(START_INDEX_KEY, java.lang.Integer.valueOf(offsetAt));
                hashMap.put(END_INDEX_KEY, java.lang.Integer.valueOf(lengthAt));
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                boolean z17 = false;
                for (int i18 = 0; i18 < suggestionsCount; i18++) {
                    java.lang.String suggestionAt = suggestionsInfoAt.getSuggestionAt(i18);
                    if (!suggestionAt.equals("")) {
                        arrayList2.add(suggestionAt);
                        z17 = true;
                    }
                }
                if (z17) {
                    hashMap.put(SUGGESTIONS_KEY, arrayList2);
                    arrayList.add(hashMap);
                }
            }
        }
        this.pendingResult.success(arrayList);
        this.pendingResult = null;
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public void onGetSuggestions(android.view.textservice.SuggestionsInfo[] suggestionsInfoArr) {
    }

    public void performSpellCheck(java.lang.String str, java.lang.String str2) {
        java.util.Locale localeFromString = io.flutter.plugin.localization.LocalizationPlugin.localeFromString(str);
        if (this.mSpellCheckerSession == null) {
            this.mSpellCheckerSession = this.mTextServicesManager.newSpellCheckerSession(null, localeFromString, this, true);
        }
        this.mSpellCheckerSession.getSentenceSuggestions(new android.view.textservice.TextInfo[]{new android.view.textservice.TextInfo(str2)}, 5);
    }
}
