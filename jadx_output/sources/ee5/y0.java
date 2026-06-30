package ee5;

/* loaded from: classes9.dex */
public final class y0 extends ee5.t2 implements zd5.p {

    /* renamed from: r, reason: collision with root package name */
    public q40.e f252093r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // ee5.t2
    public android.text.SpannableString O6() {
        return new android.text.SpannableString("");
    }

    @Override // ee5.t2
    public zd5.n P6() {
        return null;
    }

    @Override // zd5.p
    public void W2(android.view.View v17, int i17, ae5.g item) {
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemFinderFeedUIC", "[onItemClick] position:%s", java.lang.Integer.valueOf(i17));
    }

    @Override // zd5.p
    public void a6(android.view.View v17, int i17, ae5.g item) {
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemFinderFeedUIC", "[onItemLongClick] position:%s", java.lang.Integer.valueOf(i17));
    }
}
