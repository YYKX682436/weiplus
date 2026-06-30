package qs1;

/* loaded from: classes8.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qs1.m f366215d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(qs1.m mVar) {
        super(0);
        this.f366215d = mVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        qs1.m mVar = this.f366215d;
        int a17 = mVar.a();
        android.content.Context context = mVar.f366228a;
        int dimension = (int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479646bl);
        int dimension2 = (int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479731dn);
        int i17 = a17 / dimension2;
        int i18 = mVar.f366229b;
        if (i17 > i18) {
            i17 = i18;
        }
        while (true) {
            if (i17 > 1) {
                int i19 = i17 - 1;
                if (((a17 - (i17 * dimension2)) - (mVar.f366230c * 2)) / i19 >= dimension) {
                    break;
                }
                i17 = i19;
            } else if (i17 < 1) {
                i17 = 1;
            }
        }
        return java.lang.Integer.valueOf(i17);
    }
}
