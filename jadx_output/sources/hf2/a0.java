package hf2;

/* loaded from: classes10.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hf2.h0 f280997d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(hf2.h0 h0Var) {
        super(3);
        this.f280997d = h0Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        r45.ei0 restoreData = (r45.ei0) obj3;
        kotlin.jvm.internal.o.g(restoreData, "restoreData");
        hf2.h0 h0Var = this.f280997d;
        h0Var.f281070a.q7("launchStickerEditorContainer", bitmap, booleanValue, restoreData, true);
        h0Var.f281070a.m7("sticker success");
        h0Var.a();
        return jz5.f0.f302826a;
    }
}
