package y73;

/* loaded from: classes11.dex */
public abstract class u0 {
    public static void a(java.lang.String str, java.lang.String str2, java.lang.String str3, android.content.DialogInterface.OnClickListener onClickListener, java.lang.String str4, android.content.DialogInterface.OnClickListener onClickListener2) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Tinker.TinkerBootsUpdateDialogUI", "msg is null");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.TinkerBootsUpdateDialogUI", "try to show dialog");
            com.tencent.mm.sdk.platformtools.u3.h(new y73.t0(str, str2, str3, str4, onClickListener, onClickListener2));
        }
    }
}
