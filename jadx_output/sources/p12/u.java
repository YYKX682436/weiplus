package p12;

/* loaded from: classes10.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p12.w f351052d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(p12.w wVar) {
        super(2);
        this.f351052d = wVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
        p12.w wVar = this.f351052d;
        com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorTrimView emojiEditorTrimView = wVar.f351055h;
        if (emojiEditorTrimView != null) {
            emojiEditorTrimView.post(new p12.t(wVar, longValue, bitmap));
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("trimView");
        throw null;
    }
}
