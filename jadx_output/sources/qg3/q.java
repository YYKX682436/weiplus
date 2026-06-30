package qg3;

/* loaded from: classes2.dex */
public final class q extends com.tencent.unit_rc.BaseObject implements qg3.k {

    /* renamed from: h, reason: collision with root package name */
    public static final qg3.p f362844h = new qg3.p(null);

    /* renamed from: d, reason: collision with root package name */
    public yz5.l f362845d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.l f362846e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.p f362847f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.l f362848g;

    @Override // qg3.k
    public void P0(int i17, java.lang.String errMsg) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        yz5.p pVar = this.f362847f;
        if (pVar != null) {
            pVar.invoke(java.lang.Integer.valueOf(i17), errMsg);
        }
    }

    @Override // qg3.k
    public void Vh(bw5.c40 result) {
        kotlin.jvm.internal.o.g(result, "result");
        yz5.l lVar = this.f362848g;
        if (lVar != null) {
            lVar.invoke(result);
        }
    }

    @Override // qg3.k
    public void b(boolean z17) {
        yz5.l lVar = this.f362845d;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.valueOf(z17));
        }
    }

    @Override // qg3.k
    public void l(byte[] result) {
        kotlin.jvm.internal.o.g(result, "result");
    }

    @Override // qg3.k
    public void p6(bw5.zc0[] result) {
        kotlin.jvm.internal.o.g(result, "result");
    }

    @Override // qg3.k
    public void q(int i17) {
        yz5.l lVar = this.f362846e;
        if (lVar != null) {
            lVar.invoke(java.lang.Integer.valueOf(i17));
        }
    }
}
