package pr;

/* loaded from: classes15.dex */
public final class y0 implements dr.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pr.a1 f357800a;

    public y0(pr.a1 a1Var) {
        this.f357800a = a1Var;
    }

    @Override // dr.r
    public void a(int i17, com.tencent.mm.api.IEmojiInfo emojiInfo, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(emojiInfo, "emojiInfo");
        boolean z17 = true;
        if (i17 != -1 && i17 != 1) {
            z17 = false;
        }
        if (z17) {
            pm0.v.X(new pr.x0(this.f357800a, emojiInfo, i17));
        }
    }
}
