package io.flutter.embedding.engine.systemchannels;

/* loaded from: classes15.dex */
public class TextInputChannel {
    private static final java.lang.String TAG = "TextInputChannel";
    public final io.flutter.plugin.common.MethodChannel channel;
    final io.flutter.plugin.common.MethodChannel.MethodCallHandler parsingMethodHandler;
    private io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler textInputMethodHandler;

    /* loaded from: classes15.dex */
    public static class Configuration {
        public final java.lang.String actionLabel;
        public final boolean autocorrect;
        public final io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration.Autofill autofill;
        public final java.lang.String[] contentCommitMimeTypes;
        public final boolean enableDeltaModel;
        public final boolean enableIMEPersonalizedLearning;
        public final boolean enableSuggestions;
        public final io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration[] fields;
        public final java.util.Locale[] hintLocales;
        public final java.lang.Integer inputAction;
        public final io.flutter.embedding.engine.systemchannels.TextInputChannel.InputType inputType;
        public final boolean obscureText;
        public final io.flutter.embedding.engine.systemchannels.TextInputChannel.TextCapitalization textCapitalization;
        public final io.flutter.embedding.engine.systemchannels.TextInputChannel.WxInputConfiguration wxInputConfiguration;

        /* loaded from: classes15.dex */
        public static class Autofill {
            public final io.flutter.embedding.engine.systemchannels.TextInputChannel.TextEditState editState;
            public final java.lang.String hintText;
            public final java.lang.String[] hints;
            public final java.lang.String uniqueIdentifier;

            public Autofill(java.lang.String str, java.lang.String[] strArr, java.lang.String str2, io.flutter.embedding.engine.systemchannels.TextInputChannel.TextEditState textEditState) {
                this.uniqueIdentifier = str;
                this.hints = strArr;
                this.hintText = str2;
                this.editState = textEditState;
            }

            public static io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration.Autofill fromJson(org.json.JSONObject jSONObject) {
                java.lang.String string = jSONObject.getString("uniqueIdentifier");
                org.json.JSONArray jSONArray = jSONObject.getJSONArray("hints");
                java.lang.String string2 = jSONObject.isNull("hintText") ? null : jSONObject.getString("hintText");
                org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("editingValue");
                java.lang.String[] strArr = new java.lang.String[jSONArray.length()];
                for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                    strArr[i17] = translateAutofillHint(jSONArray.getString(i17));
                }
                return new io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration.Autofill(string, strArr, string2, io.flutter.embedding.engine.systemchannels.TextInputChannel.TextEditState.fromJson(jSONObject2));
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code restructure failed: missing block: B:74:0x00a6, code lost:
            
                if (r17.equals("familyName") == false) goto L7;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static java.lang.String translateAutofillHint(java.lang.String r17) {
                /*
                    Method dump skipped, instructions count: 806
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration.Autofill.translateAutofillHint(java.lang.String):java.lang.String");
            }
        }

        public Configuration(boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, io.flutter.embedding.engine.systemchannels.TextInputChannel.TextCapitalization textCapitalization, io.flutter.embedding.engine.systemchannels.TextInputChannel.InputType inputType, java.lang.Integer num, java.lang.String str, io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration.Autofill autofill, java.lang.String[] strArr, io.flutter.embedding.engine.systemchannels.TextInputChannel.WxInputConfiguration wxInputConfiguration, io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration[] configurationArr, java.util.Locale[] localeArr) {
            this.obscureText = z17;
            this.autocorrect = z18;
            this.enableSuggestions = z19;
            this.enableIMEPersonalizedLearning = z27;
            this.enableDeltaModel = z28;
            this.textCapitalization = textCapitalization;
            this.inputType = inputType;
            this.inputAction = num;
            this.actionLabel = str;
            this.autofill = autofill;
            this.contentCommitMimeTypes = strArr;
            this.wxInputConfiguration = wxInputConfiguration;
            this.fields = configurationArr;
            this.hintLocales = localeArr;
        }

        public static io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration fromJson(org.json.JSONObject jSONObject) {
            io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration[] configurationArr;
            java.util.Locale[] localeArr;
            java.lang.String string = jSONObject.getString("inputAction");
            if (string == null) {
                throw new org.json.JSONException("Configuration JSON missing 'inputAction' property.");
            }
            if (jSONObject.isNull("fields")) {
                configurationArr = null;
            } else {
                org.json.JSONArray jSONArray = jSONObject.getJSONArray("fields");
                int length = jSONArray.length();
                io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration[] configurationArr2 = new io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration[length];
                for (int i17 = 0; i17 < length; i17++) {
                    configurationArr2[i17] = fromJson(jSONArray.getJSONObject(i17));
                }
                configurationArr = configurationArr2;
            }
            java.lang.Integer inputActionFromTextInputAction = inputActionFromTextInputAction(string);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            org.json.JSONArray jSONArray2 = jSONObject.isNull("contentCommitMimeTypes") ? null : jSONObject.getJSONArray("contentCommitMimeTypes");
            if (jSONArray2 != null) {
                for (int i18 = 0; i18 < jSONArray2.length(); i18++) {
                    arrayList.add(jSONArray2.optString(i18));
                }
            }
            if (jSONObject.isNull("hintLocales")) {
                localeArr = null;
            } else {
                org.json.JSONArray jSONArray3 = jSONObject.getJSONArray("hintLocales");
                java.util.Locale[] localeArr2 = new java.util.Locale[jSONArray3.length()];
                for (int i19 = 0; i19 < jSONArray3.length(); i19++) {
                    localeArr2[i19] = java.util.Locale.forLanguageTag(jSONArray3.optString(i19));
                }
                localeArr = localeArr2;
            }
            io.flutter.Log.e(io.flutter.embedding.engine.systemchannels.TextInputChannel.TAG, "Received '" + jSONObject.getJSONObject("wxInputConfiguration").toString() + "' message.");
            return new io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration(jSONObject.optBoolean("obscureText"), jSONObject.optBoolean("autocorrect", true), jSONObject.optBoolean("enableSuggestions"), jSONObject.optBoolean("enableIMEPersonalizedLearning"), jSONObject.optBoolean("enableDeltaModel"), io.flutter.embedding.engine.systemchannels.TextInputChannel.TextCapitalization.fromValue(jSONObject.getString("textCapitalization")), io.flutter.embedding.engine.systemchannels.TextInputChannel.InputType.fromJson(jSONObject.getJSONObject("inputType")), inputActionFromTextInputAction, jSONObject.isNull("actionLabel") ? null : jSONObject.getString("actionLabel"), jSONObject.isNull("autofill") ? null : io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration.Autofill.fromJson(jSONObject.getJSONObject("autofill")), (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]), jSONObject.isNull("wxInputConfiguration") ? null : io.flutter.embedding.engine.systemchannels.TextInputChannel.WxInputConfiguration.fromJson(jSONObject.getJSONObject("wxInputConfiguration")), configurationArr, localeArr);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0073, code lost:
        
            if (r12.equals("TextInputAction.done") == false) goto L4;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.Integer inputActionFromTextInputAction(java.lang.String r12) {
            /*
                r12.getClass()
                int r0 = r12.hashCode()
                r1 = 7
                r2 = 6
                r3 = 5
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 1
                java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
                r9 = 0
                java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
                r11 = -1
                switch(r0) {
                    case -810971940: goto L76;
                    case -737377923: goto L6d;
                    case -737089298: goto L62;
                    case -737080013: goto L57;
                    case -736940669: goto L4c;
                    case 469250275: goto L41;
                    case 1241689507: goto L36;
                    case 1539450297: goto L2b;
                    case 2110497650: goto L1e;
                    default: goto L1b;
                }
            L1b:
                r7 = r11
                goto L80
            L1e:
                java.lang.String r0 = "TextInputAction.previous"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L27
                goto L1b
            L27:
                r7 = 8
                goto L80
            L2b:
                java.lang.String r0 = "TextInputAction.newline"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L34
                goto L1b
            L34:
                r7 = r1
                goto L80
            L36:
                java.lang.String r0 = "TextInputAction.go"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L3f
                goto L1b
            L3f:
                r7 = r2
                goto L80
            L41:
                java.lang.String r0 = "TextInputAction.search"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L4a
                goto L1b
            L4a:
                r7 = r3
                goto L80
            L4c:
                java.lang.String r0 = "TextInputAction.send"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L55
                goto L1b
            L55:
                r7 = r4
                goto L80
            L57:
                java.lang.String r0 = "TextInputAction.none"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L60
                goto L1b
            L60:
                r7 = r5
                goto L80
            L62:
                java.lang.String r0 = "TextInputAction.next"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L6b
                goto L1b
            L6b:
                r7 = r6
                goto L80
            L6d:
                java.lang.String r0 = "TextInputAction.done"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L80
                goto L1b
            L76:
                java.lang.String r0 = "TextInputAction.unspecified"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L7f
                goto L1b
            L7f:
                r7 = r9
            L80:
                switch(r7) {
                    case 0: goto La4;
                    case 1: goto L9f;
                    case 2: goto L9a;
                    case 3: goto L99;
                    case 4: goto L94;
                    case 5: goto L8f;
                    case 6: goto L8a;
                    case 7: goto L89;
                    case 8: goto L84;
                    default: goto L83;
                }
            L83:
                return r10
            L84:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
                return r12
            L89:
                return r8
            L8a:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r6)
                return r12
            L8f:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
                return r12
            L94:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r4)
                return r12
            L99:
                return r8
            L9a:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r3)
                return r12
            L9f:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
                return r12
            La4:
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration.inputActionFromTextInputAction(java.lang.String):java.lang.Integer");
        }
    }

    /* loaded from: classes15.dex */
    public static class InputType {
        public final boolean isDecimal;
        public final boolean isSigned;
        public final io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputType type;

        public InputType(io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputType textInputType, boolean z17, boolean z18) {
            this.type = textInputType;
            this.isSigned = z17;
            this.isDecimal = z18;
        }

        public static io.flutter.embedding.engine.systemchannels.TextInputChannel.InputType fromJson(org.json.JSONObject jSONObject) {
            return new io.flutter.embedding.engine.systemchannels.TextInputChannel.InputType(io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputType.fromValue(jSONObject.getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME)), jSONObject.optBoolean("signed", false), jSONObject.optBoolean("decimal", false));
        }
    }

    /* loaded from: classes15.dex */
    public enum TextCapitalization {
        CHARACTERS("TextCapitalization.characters"),
        WORDS("TextCapitalization.words"),
        SENTENCES("TextCapitalization.sentences"),
        NONE("TextCapitalization.none");

        private final java.lang.String encodedName;

        TextCapitalization(java.lang.String str) {
            this.encodedName = str;
        }

        public static io.flutter.embedding.engine.systemchannels.TextInputChannel.TextCapitalization fromValue(java.lang.String str) {
            for (io.flutter.embedding.engine.systemchannels.TextInputChannel.TextCapitalization textCapitalization : values()) {
                if (textCapitalization.encodedName.equals(str)) {
                    return textCapitalization;
                }
            }
            throw new java.lang.NoSuchFieldException("No such TextCapitalization: " + str);
        }
    }

    /* loaded from: classes15.dex */
    public static class TextEditState {
        public final int composingEnd;
        public final int composingStart;
        public final int selectionEnd;
        public final int selectionStart;
        public final java.lang.String text;

        public TextEditState(java.lang.String str, int i17, int i18, int i19, int i27) {
            if (!(i17 == -1 && i18 == -1) && (i17 < 0 || i18 < 0)) {
                throw new java.lang.IndexOutOfBoundsException("invalid selection: (" + java.lang.String.valueOf(i17) + ", " + java.lang.String.valueOf(i18) + ")");
            }
            if (!(i19 == -1 && i27 == -1) && (i19 < 0 || i19 > i27)) {
                throw new java.lang.IndexOutOfBoundsException("invalid composing range: (" + java.lang.String.valueOf(i19) + ", " + java.lang.String.valueOf(i27) + ")");
            }
            if (i27 > str.length()) {
                throw new java.lang.IndexOutOfBoundsException("invalid composing start: " + java.lang.String.valueOf(i19));
            }
            if (i17 > str.length()) {
                throw new java.lang.IndexOutOfBoundsException("invalid selection start: " + java.lang.String.valueOf(i17));
            }
            if (i18 > str.length()) {
                throw new java.lang.IndexOutOfBoundsException("invalid selection end: " + java.lang.String.valueOf(i18));
            }
            this.text = str;
            this.selectionStart = i17;
            this.selectionEnd = i18;
            this.composingStart = i19;
            this.composingEnd = i27;
        }

        public static java.util.Map<java.lang.String, java.lang.Integer> formJsonOnlySelection(org.json.JSONObject jSONObject) {
            java.util.HashMap hashMap = new java.util.HashMap();
            int optInt = jSONObject.optInt("selectionBase", 0);
            int optInt2 = jSONObject.optInt("selectionExtent", 0);
            hashMap.put("selectionBase", java.lang.Integer.valueOf(optInt));
            hashMap.put("selectionExtent", java.lang.Integer.valueOf(optInt2));
            io.flutter.Log.d(io.flutter.embedding.engine.systemchannels.TextInputChannel.TAG, "formJsonOnlySelection selectionBase: " + optInt + ", selectionExtent: " + optInt2);
            return hashMap;
        }

        public static io.flutter.embedding.engine.systemchannels.TextInputChannel.TextEditState fromJson(org.json.JSONObject jSONObject) {
            return new io.flutter.embedding.engine.systemchannels.TextInputChannel.TextEditState(jSONObject.getString(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"));
        }

        public boolean hasComposing() {
            int i17 = this.composingStart;
            return i17 >= 0 && this.composingEnd > i17;
        }

        public boolean hasSelection() {
            return this.selectionStart >= 0;
        }
    }

    /* loaded from: classes15.dex */
    public interface TextInputMethodHandler {
        void clearClient();

        void finishAutofillContext(boolean z17);

        void hide();

        void requestAutofill();

        void sendAppPrivateCommand(java.lang.String str, android.os.Bundle bundle);

        void setClient(int i17, io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration configuration);

        void setEditableSizeAndTransform(double d17, double d18, double[] dArr);

        void setEditingState(io.flutter.embedding.engine.systemchannels.TextInputChannel.TextEditState textEditState);

        void setPlatformViewClient(int i17, boolean z17);

        void setTextSelectionState(java.util.Map<java.lang.String, java.lang.Integer> map);

        void show();
    }

    /* loaded from: classes15.dex */
    public enum TextInputType {
        TEXT("TextInputType.text"),
        DATETIME("TextInputType.datetime"),
        NAME("TextInputType.name"),
        POSTAL_ADDRESS("TextInputType.address"),
        NUMBER("TextInputType.number"),
        PHONE("TextInputType.phone"),
        MULTILINE("TextInputType.multiline"),
        EMAIL_ADDRESS("TextInputType.emailAddress"),
        URL("TextInputType.url"),
        VISIBLE_PASSWORD("TextInputType.visiblePassword"),
        NONE("TextInputType.none"),
        WEB_SEARCH("TextInputType.webSearch"),
        TWITTER("TextInputType.twitter");

        private final java.lang.String encodedName;

        TextInputType(java.lang.String str) {
            this.encodedName = str;
        }

        public static io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputType fromValue(java.lang.String str) {
            for (io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputType textInputType : values()) {
                if (textInputType.encodedName.equals(str)) {
                    return textInputType;
                }
            }
            throw new java.lang.NoSuchFieldException("No such TextInputType: " + str);
        }
    }

    /* loaded from: classes7.dex */
    public static class WxInputConfiguration {
        public final boolean adjustPosition;
        public final boolean confirmHold;
        public final int cursorSpacing;
        public final int dartWidgetId;
        public final java.lang.String elementTag;
        public final int inputId;
        public final java.lang.String keyboardData;
        public final io.flutter.embedding.engine.systemchannels.TextInputChannel.WxKeyboardType keyboardType;
        public final boolean showConfirmBar;
        public final boolean showKeyBoardCoverView;
        public final boolean usePasswordMode;

        public WxInputConfiguration(int i17, int i18, java.lang.String str, io.flutter.embedding.engine.systemchannels.TextInputChannel.WxKeyboardType wxKeyboardType, int i19, boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, java.lang.String str2) {
            this.inputId = i17;
            this.dartWidgetId = i18;
            this.elementTag = str;
            this.keyboardType = wxKeyboardType;
            this.cursorSpacing = i19;
            this.showConfirmBar = z17;
            this.usePasswordMode = z18;
            this.showKeyBoardCoverView = z19;
            this.confirmHold = z27;
            this.adjustPosition = z28;
            this.keyboardData = str2;
        }

        public static io.flutter.embedding.engine.systemchannels.TextInputChannel.WxInputConfiguration fromJson(org.json.JSONObject jSONObject) {
            return new io.flutter.embedding.engine.systemchannels.TextInputChannel.WxInputConfiguration(jSONObject.getInt("inputId"), jSONObject.getInt("dartWidgetId"), jSONObject.getString("elementTag"), io.flutter.embedding.engine.systemchannels.TextInputChannel.WxKeyboardType.fromValue(jSONObject.getString("keyboardType")), jSONObject.getInt("cursorSpacing"), jSONObject.optBoolean("showConfirmBar", false), jSONObject.optBoolean("usePasswordMode", false), jSONObject.optBoolean("showKeyBoardCoverView", false), jSONObject.optBoolean("confirmHold", false), jSONObject.optBoolean("adjustPosition", true), jSONObject.optString("keyboardData"));
        }
    }

    /* loaded from: classes7.dex */
    public enum WxKeyboardType {
        TEXT("WxKeyboardType.Text"),
        NUMBER("WxKeyboardType.Number"),
        DIGIT("WxKeyboardType.Digit"),
        IDCARD("WxKeyboardType.IDCard"),
        SAFEPASSWORD("WxKeyboardType.SafePassword"),
        CUSTOM("WxKeyboardType.Custom");

        private final java.lang.String encodedName;

        WxKeyboardType(java.lang.String str) {
            this.encodedName = str;
        }

        public static io.flutter.embedding.engine.systemchannels.TextInputChannel.WxKeyboardType fromValue(java.lang.String str) {
            for (io.flutter.embedding.engine.systemchannels.TextInputChannel.WxKeyboardType wxKeyboardType : values()) {
                if (wxKeyboardType.encodedName.equals(str)) {
                    return wxKeyboardType;
                }
            }
            throw new java.lang.NoSuchFieldException("No such WxKeyboardType: " + str);
        }
    }

    public TextInputChannel(io.flutter.embedding.engine.dart.DartExecutor dartExecutor) {
        io.flutter.plugin.common.MethodChannel.MethodCallHandler methodCallHandler = new io.flutter.plugin.common.MethodChannel.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.TextInputChannel.1
            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public void onMethodCall(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
                android.os.Bundle bundle;
                if (io.flutter.embedding.engine.systemchannels.TextInputChannel.this.textInputMethodHandler == null) {
                    return;
                }
                java.lang.String str = methodCall.method;
                java.lang.Object obj = methodCall.arguments;
                io.flutter.Log.v(io.flutter.embedding.engine.systemchannels.TextInputChannel.TAG, "Received '" + str + "' message.");
                str.getClass();
                char c17 = 65535;
                switch (str.hashCode()) {
                    case -1779068172:
                        if (str.equals("TextInput.setPlatformViewClient")) {
                            c17 = 0;
                            break;
                        }
                        break;
                    case -1015421462:
                        if (str.equals("TextInput.setEditingState")) {
                            c17 = 1;
                            break;
                        }
                        break;
                    case -724389821:
                        if (str.equals("TextInput.setTextSelectionState")) {
                            c17 = 2;
                            break;
                        }
                        break;
                    case -37561188:
                        if (str.equals("TextInput.setClient")) {
                            c17 = 3;
                            break;
                        }
                        break;
                    case 270476819:
                        if (str.equals("TextInput.hide")) {
                            c17 = 4;
                            break;
                        }
                        break;
                    case 270803918:
                        if (str.equals("TextInput.show")) {
                            c17 = 5;
                            break;
                        }
                        break;
                    case 649192816:
                        if (str.equals("TextInput.sendAppPrivateCommand")) {
                            c17 = 6;
                            break;
                        }
                        break;
                    case 1204752139:
                        if (str.equals("TextInput.setEditableSizeAndTransform")) {
                            c17 = 7;
                            break;
                        }
                        break;
                    case 1727570905:
                        if (str.equals("TextInput.finishAutofillContext")) {
                            c17 = '\b';
                            break;
                        }
                        break;
                    case 1904427655:
                        if (str.equals("TextInput.clearClient")) {
                            c17 = '\t';
                            break;
                        }
                        break;
                    case 2113369584:
                        if (str.equals("TextInput.requestAutofill")) {
                            c17 = '\n';
                            break;
                        }
                        break;
                }
                switch (c17) {
                    case 0:
                        try {
                            org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
                            io.flutter.embedding.engine.systemchannels.TextInputChannel.this.textInputMethodHandler.setPlatformViewClient(jSONObject.getInt("platformViewId"), jSONObject.optBoolean("usesVirtualDisplay", false));
                            result.success(null);
                            return;
                        } catch (org.json.JSONException e17) {
                            result.error("error", e17.getMessage(), null);
                            return;
                        }
                    case 1:
                        try {
                            io.flutter.embedding.engine.systemchannels.TextInputChannel.this.textInputMethodHandler.setEditingState(io.flutter.embedding.engine.systemchannels.TextInputChannel.TextEditState.fromJson((org.json.JSONObject) obj));
                            result.success(null);
                            return;
                        } catch (org.json.JSONException e18) {
                            result.error("error", e18.getMessage(), null);
                            return;
                        }
                    case 2:
                        try {
                            io.flutter.embedding.engine.systemchannels.TextInputChannel.this.textInputMethodHandler.setTextSelectionState(io.flutter.embedding.engine.systemchannels.TextInputChannel.TextEditState.formJsonOnlySelection((org.json.JSONObject) obj));
                            result.success(null);
                            return;
                        } catch (org.json.JSONException e19) {
                            result.error("error", e19.getMessage(), null);
                            return;
                        }
                    case 3:
                        try {
                            org.json.JSONArray jSONArray = (org.json.JSONArray) obj;
                            io.flutter.embedding.engine.systemchannels.TextInputChannel.this.textInputMethodHandler.setClient(jSONArray.getInt(0), io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration.fromJson(jSONArray.getJSONObject(1)));
                            result.success(null);
                            return;
                        } catch (java.lang.NoSuchFieldException | org.json.JSONException e27) {
                            result.error("error", e27.getMessage(), null);
                            return;
                        }
                    case 4:
                        io.flutter.embedding.engine.systemchannels.TextInputChannel.this.textInputMethodHandler.hide();
                        result.success(null);
                        return;
                    case 5:
                        io.flutter.embedding.engine.systemchannels.TextInputChannel.this.textInputMethodHandler.show();
                        result.success(null);
                        return;
                    case 6:
                        try {
                            org.json.JSONObject jSONObject2 = (org.json.JSONObject) obj;
                            java.lang.String string = jSONObject2.getString("action");
                            java.lang.String string2 = jSONObject2.getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
                            if (string2 == null || string2.isEmpty()) {
                                bundle = null;
                            } else {
                                bundle = new android.os.Bundle();
                                bundle.putString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, string2);
                            }
                            io.flutter.embedding.engine.systemchannels.TextInputChannel.this.textInputMethodHandler.sendAppPrivateCommand(string, bundle);
                            result.success(null);
                            return;
                        } catch (org.json.JSONException e28) {
                            result.error("error", e28.getMessage(), null);
                            return;
                        }
                    case 7:
                        try {
                            org.json.JSONObject jSONObject3 = (org.json.JSONObject) obj;
                            double d17 = jSONObject3.getDouble("width");
                            double d18 = jSONObject3.getDouble("height");
                            org.json.JSONArray jSONArray2 = jSONObject3.getJSONArray("transform");
                            double[] dArr = new double[16];
                            for (int i17 = 0; i17 < 16; i17++) {
                                dArr[i17] = jSONArray2.getDouble(i17);
                            }
                            io.flutter.embedding.engine.systemchannels.TextInputChannel.this.textInputMethodHandler.setEditableSizeAndTransform(d17, d18, dArr);
                            result.success(null);
                            return;
                        } catch (org.json.JSONException e29) {
                            result.error("error", e29.getMessage(), null);
                            return;
                        }
                    case '\b':
                        io.flutter.embedding.engine.systemchannels.TextInputChannel.this.textInputMethodHandler.finishAutofillContext(((java.lang.Boolean) obj).booleanValue());
                        result.success(null);
                        return;
                    case '\t':
                        io.flutter.embedding.engine.systemchannels.TextInputChannel.this.textInputMethodHandler.clearClient();
                        result.success(null);
                        return;
                    case '\n':
                        io.flutter.embedding.engine.systemchannels.TextInputChannel.this.textInputMethodHandler.requestAutofill();
                        result.success(null);
                        return;
                    default:
                        result.notImplemented();
                        return;
                }
            }
        };
        this.parsingMethodHandler = methodCallHandler;
        io.flutter.plugin.common.MethodChannel methodChannel = new io.flutter.plugin.common.MethodChannel(dartExecutor, "flutter/textinput", io.flutter.plugin.common.JSONMethodCodec.INSTANCE);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(methodCallHandler);
    }

    private static java.util.HashMap<java.lang.Object, java.lang.Object> createEditingDeltaJSON(java.util.ArrayList<io.flutter.plugin.editing.TextEditingDelta> arrayList) {
        java.util.HashMap<java.lang.Object, java.lang.Object> hashMap = new java.util.HashMap<>();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator<io.flutter.plugin.editing.TextEditingDelta> it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().toJSON());
        }
        hashMap.put("deltas", jSONArray);
        return hashMap;
    }

    private static java.util.HashMap<java.lang.Object, java.lang.Object> createEditingStateJSON(java.lang.String str, int i17, int i18, int i19, int i27) {
        java.util.HashMap<java.lang.Object, java.lang.Object> hashMap = new java.util.HashMap<>();
        hashMap.put(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, str);
        hashMap.put("selectionBase", java.lang.Integer.valueOf(i17));
        hashMap.put("selectionExtent", java.lang.Integer.valueOf(i18));
        hashMap.put("composingBase", java.lang.Integer.valueOf(i19));
        hashMap.put("composingExtent", java.lang.Integer.valueOf(i27));
        return hashMap;
    }

    public void commitContent(int i17, java.util.Map<java.lang.String, java.lang.Object> map) {
        io.flutter.Log.v(TAG, "Sending 'commitContent' message.");
        this.channel.invokeMethod("TextInputClient.performAction", java.util.Arrays.asList(java.lang.Integer.valueOf(i17), "TextInputAction.commitContent", map));
    }

    public void done(int i17) {
        io.flutter.Log.v(TAG, "Sending 'done' message.");
        this.channel.invokeMethod("TextInputClient.performAction", java.util.Arrays.asList(java.lang.Integer.valueOf(i17), "TextInputAction.done"));
    }

    public void go(int i17) {
        io.flutter.Log.v(TAG, "Sending 'go' message.");
        this.channel.invokeMethod("TextInputClient.performAction", java.util.Arrays.asList(java.lang.Integer.valueOf(i17), "TextInputAction.go"));
    }

    public void newline(int i17) {
        io.flutter.Log.v(TAG, "Sending 'newline' message.");
        this.channel.invokeMethod("TextInputClient.performAction", java.util.Arrays.asList(java.lang.Integer.valueOf(i17), "TextInputAction.newline"));
    }

    public void next(int i17) {
        io.flutter.Log.v(TAG, "Sending 'next' message.");
        this.channel.invokeMethod("TextInputClient.performAction", java.util.Arrays.asList(java.lang.Integer.valueOf(i17), "TextInputAction.next"));
    }

    public void performPrivateCommand(int i17, java.lang.String str, android.os.Bundle bundle) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("action", str);
        if (bundle != null) {
            java.util.HashMap hashMap2 = new java.util.HashMap();
            for (java.lang.String str2 : bundle.keySet()) {
                java.lang.Object obj = bundle.get(str2);
                if (obj instanceof byte[]) {
                    hashMap2.put(str2, bundle.getByteArray(str2));
                } else if (obj instanceof java.lang.Byte) {
                    hashMap2.put(str2, java.lang.Byte.valueOf(bundle.getByte(str2)));
                } else if (obj instanceof char[]) {
                    hashMap2.put(str2, bundle.getCharArray(str2));
                } else if (obj instanceof java.lang.Character) {
                    hashMap2.put(str2, java.lang.Character.valueOf(bundle.getChar(str2)));
                } else if (obj instanceof java.lang.CharSequence[]) {
                    hashMap2.put(str2, bundle.getCharSequenceArray(str2));
                } else if (obj instanceof java.lang.CharSequence) {
                    hashMap2.put(str2, bundle.getCharSequence(str2));
                } else if (obj instanceof float[]) {
                    hashMap2.put(str2, bundle.getFloatArray(str2));
                } else if (obj instanceof java.lang.Float) {
                    hashMap2.put(str2, java.lang.Float.valueOf(bundle.getFloat(str2)));
                }
            }
            hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, hashMap2);
        }
        this.channel.invokeMethod("TextInputClient.performPrivateCommand", java.util.Arrays.asList(java.lang.Integer.valueOf(i17), hashMap));
    }

    public void previous(int i17) {
        io.flutter.Log.v(TAG, "Sending 'previous' message.");
        this.channel.invokeMethod("TextInputClient.performAction", java.util.Arrays.asList(java.lang.Integer.valueOf(i17), "TextInputAction.previous"));
    }

    public void requestExistingInputState() {
        this.channel.invokeMethod("TextInputClient.requestExistingInputState", null);
    }

    public void search(int i17) {
        io.flutter.Log.v(TAG, "Sending 'search' message.");
        this.channel.invokeMethod("TextInputClient.performAction", java.util.Arrays.asList(java.lang.Integer.valueOf(i17), "TextInputAction.search"));
    }

    public void send(int i17) {
        io.flutter.Log.v(TAG, "Sending 'send' message.");
        this.channel.invokeMethod("TextInputClient.performAction", java.util.Arrays.asList(java.lang.Integer.valueOf(i17), "TextInputAction.send"));
    }

    public void setTextInputMethodHandler(io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler textInputMethodHandler) {
        this.textInputMethodHandler = textInputMethodHandler;
    }

    public void unspecifiedAction(int i17) {
        io.flutter.Log.v(TAG, "Sending 'unspecified' message.");
        this.channel.invokeMethod("TextInputClient.performAction", java.util.Arrays.asList(java.lang.Integer.valueOf(i17), "TextInputAction.unspecified"));
    }

    public void updateEditingState(int i17, java.lang.String str, int i18, int i19, int i27, int i28) {
        io.flutter.Log.v(TAG, "Sending message to update editing state: \nText: " + str + "\nSelection start: " + i18 + "\nSelection end: " + i19 + "\nComposing start: " + i27 + "\nComposing end: " + i28);
        this.channel.invokeMethod("TextInputClient.updateEditingState", java.util.Arrays.asList(java.lang.Integer.valueOf(i17), createEditingStateJSON(str, i18, i19, i27, i28)));
    }

    public void updateEditingStateWithDeltas(int i17, java.util.ArrayList<io.flutter.plugin.editing.TextEditingDelta> arrayList) {
        io.flutter.Log.v(TAG, "Sending message to update editing state with deltas: \nNumber of deltas: " + arrayList.size());
        this.channel.invokeMethod("TextInputClient.updateEditingStateWithDeltas", java.util.Arrays.asList(java.lang.Integer.valueOf(i17), createEditingDeltaJSON(arrayList)));
    }

    public void updateEditingStateWithTag(int i17, java.util.HashMap<java.lang.String, io.flutter.embedding.engine.systemchannels.TextInputChannel.TextEditState> hashMap) {
        io.flutter.Log.v(TAG, "Sending message to update editing state for " + java.lang.String.valueOf(hashMap.size()) + " field(s).");
        java.util.HashMap hashMap2 = new java.util.HashMap();
        for (java.util.Map.Entry<java.lang.String, io.flutter.embedding.engine.systemchannels.TextInputChannel.TextEditState> entry : hashMap.entrySet()) {
            io.flutter.embedding.engine.systemchannels.TextInputChannel.TextEditState value = entry.getValue();
            hashMap2.put(entry.getKey(), createEditingStateJSON(value.text, value.selectionStart, value.selectionEnd, -1, -1));
        }
        this.channel.invokeMethod("TextInputClient.updateEditingStateWithTag", java.util.Arrays.asList(java.lang.Integer.valueOf(i17), hashMap2));
    }
}
