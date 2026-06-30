package r14;

/* loaded from: classes5.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r14.y f368632d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(r14.y yVar) {
        super(1);
        this.f368632d = yVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Ksnsupload_source", 1);
        intent.putExtra("need_result", true);
        intent.putExtra("Ksnsupload_type", 0);
        intent.putExtra("sns_kemdia_path", it);
        j45.l.n(this.f368632d.f368633a, "sns", ".ui.SnsUploadUI", intent, 2);
        return jz5.f0.f302826a;
    }
}
