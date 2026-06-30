package fk5;

/* loaded from: classes12.dex */
public final class w implements f65.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263680a;

    public w(java.lang.String str) {
        this.f263680a = str;
    }

    @Override // f65.a
    public void a(long j17, java.util.Map params) {
        kotlin.jvm.internal.o.g(params, "params");
        com.tencent.mm.storage.f9 n17 = pt0.f0.f358209b1.n(this.f263680a, j17);
        fk5.y yVar = fk5.y.f263683d;
        yVar.e(n17, params, n17.P0() == 2);
        synchronized (yVar.f259871c) {
            ((java.util.ArrayList) yVar.f259871c).remove(java.lang.Long.valueOf(j17));
        }
    }
}
