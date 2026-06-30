package r53;

/* loaded from: classes8.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f392687d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r53.s f392688e;

    public r(r53.s sVar, android.graphics.Bitmap bitmap) {
        this.f392688e = sVar;
        this.f392687d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        r53.s sVar = this.f392688e;
        sVar.f392689a.setImageBitmap(this.f392687d);
        android.view.ViewGroup.LayoutParams layoutParams = sVar.f392689a.getLayoutParams();
        int i17 = sVar.f392692d;
        layoutParams.width = i17;
        layoutParams.height = (int) ((sVar.f392690b / sVar.f392691c) * i17);
        sVar.f392689a.setLayoutParams(layoutParams);
        sVar.f392689a.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
    }
}
