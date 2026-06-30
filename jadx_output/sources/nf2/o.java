package nf2;

/* loaded from: classes10.dex */
public final class o implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nf2.w f336783d;

    public o(nf2.w wVar) {
        this.f336783d = wVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        android.widget.ImageView imageView;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        nf2.d1 d1Var = this.f336783d.f336808m;
        if (d1Var != null && (imageView = d1Var.f336695p) != null) {
            imageView.setImageResource(booleanValue ? com.tencent.mm.R.raw.finder_live_lyrics_on : com.tencent.mm.R.raw.finder_live_lyrics_off);
        }
        return jz5.f0.f302826a;
    }
}
