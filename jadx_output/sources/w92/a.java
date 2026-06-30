package w92;

/* loaded from: classes2.dex */
public class a extends zx2.k {

    /* renamed from: k, reason: collision with root package name */
    public boolean f444072k;

    /* renamed from: l, reason: collision with root package name */
    public final int f444073l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i17, java.lang.String title, boolean z17, int i18, int i19) {
        super(title, i17);
        kotlin.jvm.internal.o.g(title, "title");
        this.f444072k = z17;
        this.f444073l = i18;
    }

    @Override // zx2.k, zx2.i
    public int a() {
        return com.tencent.mm.R.layout.b9w;
    }

    @Override // zx2.i
    public int[] b() {
        return new int[]{0, 24};
    }

    @Override // zx2.k
    public void k(boolean z17) {
        android.widget.TextView textView = this.f477052j;
        if (textView != null) {
            if (this.f444072k) {
                if (z17) {
                    textView.setTextColor(textView.getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_9));
                    return;
                } else {
                    textView.setTextColor(textView.getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_5));
                    return;
                }
            }
            if (z17) {
                textView.setTextColor(textView.getContext().getResources().getColor(com.tencent.mm.R.color.FG_0));
            } else {
                textView.setTextColor(textView.getContext().getResources().getColor(com.tencent.mm.R.color.FG_1));
            }
        }
    }

    public /* synthetic */ a(int i17, java.lang.String str, boolean z17, int i18, int i19, int i27, kotlin.jvm.internal.i iVar) {
        this(i17, (i27 & 2) != 0 ? "" : str, z17, (i27 & 8) != 0 ? -1 : i18, (i27 & 16) != 0 ? -1 : i19);
    }
}
