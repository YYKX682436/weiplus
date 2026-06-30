package p12;

/* loaded from: classes10.dex */
public final class x extends p12.w {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(android.app.Activity activity, com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorPreviewLayout previewLayout) {
        super(activity, previewLayout);
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(previewLayout, "previewLayout");
    }

    @Override // p12.w
    public l12.a d() {
        this.f351026e = this.f351024c < 5000 ? new android.util.Range(500, java.lang.Integer.valueOf(this.f351024c)) : new android.util.Range(500, 5000);
        int i17 = this.f351024c;
        this.f351058k = i17 < 5000 ? new android.util.Range(0, java.lang.Integer.valueOf(this.f351024c)) : i17 < 8000 ? i17 - 5000 < 500 ? new android.util.Range(java.lang.Integer.valueOf(this.f351024c - 500), java.lang.Integer.valueOf(this.f351024c)) : new android.util.Range(5000, java.lang.Integer.valueOf(this.f351024c)) : new android.util.Range(5000, 8000);
        f(true);
        return l12.a.f314980e;
    }
}
