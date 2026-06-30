package l31;

/* loaded from: classes9.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f315327d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l31.f0 f315328e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f315329f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.msgsubscription.SubscribeMsgRequestResult f315330g;

    public c0(kotlin.jvm.internal.c0 c0Var, l31.f0 f0Var, java.lang.String str, com.tencent.mm.msgsubscription.SubscribeMsgRequestResult subscribeMsgRequestResult) {
        this.f315327d = c0Var;
        this.f315328e = f0Var;
        this.f315329f = str;
        this.f315330g = subscribeMsgRequestResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17 = this.f315327d.f310112d;
        l31.f0 f0Var = this.f315328e;
        com.tencent.mm.msgsubscription.SubscribeMsgRequestResult subscribeMsgRequestResult = this.f315330g;
        if (!z17) {
            k31.a aVar = f0Var.f315343g;
            if (aVar != null) {
                ((k31.h) aVar).i(this.f315329f, null, subscribeMsgRequestResult != null ? subscribeMsgRequestResult.f71789o : false, true, false);
                return;
            }
            return;
        }
        k31.a aVar2 = f0Var.f315343g;
        if (aVar2 != null) {
            java.lang.String str = this.f315329f;
            java.util.ArrayList arrayList = subscribeMsgRequestResult != null ? subscribeMsgRequestResult.f71785h : null;
            kotlin.jvm.internal.o.d(arrayList);
            ((k31.h) aVar2).i(str, arrayList, subscribeMsgRequestResult.f71789o, true, false);
        }
    }
}
