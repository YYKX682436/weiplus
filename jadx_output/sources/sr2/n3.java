package sr2;

/* loaded from: classes8.dex */
public final class n3 implements com.tencent.mm.plugin.finder.assist.m8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.post.PostMainUIC f411644a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f411645b;

    public n3(com.tencent.mm.plugin.finder.post.PostMainUIC postMainUIC, yz5.a aVar) {
        this.f411644a = postMainUIC;
        this.f411645b = aVar;
    }

    @Override // com.tencent.mm.plugin.finder.assist.m8
    public void b() {
        this.f411644a.w7();
    }

    @Override // com.tencent.mm.plugin.finder.assist.m8
    public void c(com.tencent.mm.plugin.finder.assist.h9 result) {
        kotlin.jvm.internal.o.g(result, "result");
        boolean z17 = result.f102233a;
        com.tencent.mm.plugin.finder.post.PostMainUIC postMainUIC = this.f411644a;
        boolean z18 = result.f102234b;
        if (z17) {
            if (z18) {
                postMainUIC.O7("");
            }
            this.f411645b.invoke();
        } else {
            if (z18) {
                return;
            }
            postMainUIC.w7();
        }
    }
}
