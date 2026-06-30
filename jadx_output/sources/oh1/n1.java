package oh1;

/* loaded from: classes9.dex */
public class n1 implements l01.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f345263d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f345264e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.text.SpannableString f345265f;

    public n1(oh1.o1 o1Var, java.lang.ref.WeakReference weakReference, java.lang.ref.WeakReference weakReference2, android.text.SpannableString spannableString) {
        this.f345263d = weakReference;
        this.f345264e = weakReference2;
        this.f345265f = spannableString;
    }

    @Override // l01.u
    public void b() {
    }

    @Override // l01.u
    public void d() {
    }

    @Override // l01.i0
    public java.lang.String key() {
        return oh1.o1.class.getSimpleName();
    }

    @Override // l01.u
    public void onBitmapLoaded(android.graphics.Bitmap bitmap) {
        com.tencent.neattextview.textview.view.NeatTextView neatTextView = (com.tencent.neattextview.textview.view.NeatTextView) this.f345263d.get();
        android.content.Context context = (android.content.Context) this.f345264e.get();
        if (context == null || neatTextView == null) {
            return;
        }
        android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(context.getResources(), bitmap);
        bitmapDrawable.setBounds(0, 0, ik1.j0.a(16), ik1.j0.a(16));
        yl1.b bVar = new yl1.b(bitmapDrawable, 1);
        android.text.SpannableString spannableString = new android.text.SpannableString("@ ");
        spannableString.setSpan(bVar, 0, 1, 33);
        neatTextView.b(android.text.TextUtils.concat(spannableString, this.f345265f));
        neatTextView.invalidate();
    }
}
