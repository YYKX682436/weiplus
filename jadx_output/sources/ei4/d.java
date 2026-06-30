package ei4;

/* loaded from: classes11.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ei4.h f253207d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l75.w0 f253208e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ei4.h hVar, l75.w0 w0Var) {
        super(0);
        this.f253207d = hVar;
        this.f253208e = w0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object obj = this.f253208e.f316976d;
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.model.storage.TextStatusStrangerContact");
        ei4.h hVar = this.f253207d;
        hi4.a aVar = (hi4.a) hVar.f253216f.get(((mj4.w) obj).field_sessionId);
        int c07 = kz5.n0.c0(hVar.f253215e, aVar);
        if (aVar != null) {
            aVar.t0();
        }
        hVar.notifyItemChanged(c07);
        return jz5.f0.f302826a;
    }
}
