package io.flutter.plugin.editing;

/* loaded from: classes15.dex */
public final class TextEditingDelta {
    private static final java.lang.String TAG = "TextEditingDelta";
    private int deltaEnd;
    private int deltaStart;
    private java.lang.CharSequence deltaText;
    private int newComposingEnd;
    private int newComposingStart;
    private int newSelectionEnd;
    private int newSelectionStart;
    private java.lang.CharSequence oldText;

    public TextEditingDelta(java.lang.CharSequence charSequence, int i17, int i18, java.lang.CharSequence charSequence2, int i19, int i27, int i28, int i29) {
        this.newSelectionStart = i19;
        this.newSelectionEnd = i27;
        this.newComposingStart = i28;
        this.newComposingEnd = i29;
        setDeltas(charSequence, charSequence2.toString(), i17, i18);
    }

    private void setDeltas(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, int i17, int i18) {
        this.oldText = charSequence;
        this.deltaText = charSequence2;
        this.deltaStart = i17;
        this.deltaEnd = i18;
    }

    public int getDeltaEnd() {
        return this.deltaEnd;
    }

    public int getDeltaStart() {
        return this.deltaStart;
    }

    public java.lang.CharSequence getDeltaText() {
        return this.deltaText;
    }

    public int getNewComposingEnd() {
        return this.newComposingEnd;
    }

    public int getNewComposingStart() {
        return this.newComposingStart;
    }

    public int getNewSelectionEnd() {
        return this.newSelectionEnd;
    }

    public int getNewSelectionStart() {
        return this.newSelectionStart;
    }

    public java.lang.CharSequence getOldText() {
        return this.oldText;
    }

    public org.json.JSONObject toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("oldText", this.oldText.toString());
            jSONObject.put("deltaText", this.deltaText.toString());
            jSONObject.put("deltaStart", this.deltaStart);
            jSONObject.put("deltaEnd", this.deltaEnd);
            jSONObject.put("selectionBase", this.newSelectionStart);
            jSONObject.put("selectionExtent", this.newSelectionEnd);
            jSONObject.put("composingBase", this.newComposingStart);
            jSONObject.put("composingExtent", this.newComposingEnd);
        } catch (org.json.JSONException e17) {
            io.flutter.Log.e(TAG, "unable to create JSONObject: " + e17);
        }
        return jSONObject;
    }

    public TextEditingDelta(java.lang.CharSequence charSequence, int i17, int i18, int i19, int i27) {
        this.newSelectionStart = i17;
        this.newSelectionEnd = i18;
        this.newComposingStart = i19;
        this.newComposingEnd = i27;
        setDeltas(charSequence, "", -1, -1);
    }
}
