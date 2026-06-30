package nf2;

/* loaded from: classes10.dex */
public final class l implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nf2.w f336770d;

    public l(nf2.w wVar) {
        this.f336770d = wVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        nf2.d1 d1Var = this.f336770d.f336808m;
        if (d1Var != null) {
            boolean z17 = !booleanValue;
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = d1Var.f336694o;
            if (weImageView != null) {
                weImageView.setImageResource(z17 ? com.tencent.mm.R.raw.pause_filled : com.tencent.mm.R.raw.play_filled);
            }
        }
        return jz5.f0.f302826a;
    }
}
