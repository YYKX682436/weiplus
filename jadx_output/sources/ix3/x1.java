package ix3;

/* loaded from: classes12.dex */
public final class x1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.exifinterface.media.ExifInterface f295602d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ix3.z1 f295603e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f295604f;

    public x1(androidx.exifinterface.media.ExifInterface exifInterface, ix3.z1 z1Var, java.lang.String str) {
        this.f295602d = exifInterface;
        this.f295603e = z1Var;
        this.f295604f = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/uic/RepairerFileMsgDebugUIC$showAllExifInfo$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        androidx.exifinterface.media.ExifInterface exifInterface = this.f295602d;
        exifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_DATETIME_ORIGINAL, null);
        exifInterface.saveAttributes();
        this.f295603e.U6(this.f295604f);
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/uic/RepairerFileMsgDebugUIC$showAllExifInfo$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
