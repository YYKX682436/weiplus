package ea2;

/* loaded from: classes3.dex */
public final class e extends x92.l {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // x92.l
    public void V6() {
    }

    @Override // x92.l
    public void W6(boolean z17) {
        super.W6(z17);
        android.view.ViewGroup viewGroup = this.f452705i;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        android.widget.ImageView imageView = this.f452703g;
        if (imageView != null) {
            imageView.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.aaz));
        }
    }
}
