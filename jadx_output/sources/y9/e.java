package y9;

/* loaded from: classes14.dex */
public class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y9.i f460244d;

    public e(y9.i iVar) {
        this.f460244d = iVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        y9.i iVar = this.f460244d;
        if (iVar.f460248g && iVar.isShowing()) {
            if (!iVar.f460250i) {
                android.content.res.TypedArray obtainStyledAttributes = iVar.getContext().obtainStyledAttributes(new int[]{android.R.attr.windowCloseOnTouchOutside});
                iVar.f460249h = obtainStyledAttributes.getBoolean(0, true);
                obtainStyledAttributes.recycle();
                iVar.f460250i = true;
            }
            if (iVar.f460249h) {
                iVar.cancel();
            }
        }
    }
}
