package ya2;

/* loaded from: classes2.dex */
public final class h1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public static final ya2.h1 f460487d = new ya2.h1();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("Finder.FinderSdkShareApi", "dialog cancel");
        dialogInterface.dismiss();
    }
}
