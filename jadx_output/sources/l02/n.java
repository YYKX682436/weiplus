package l02;

/* loaded from: classes3.dex */
public abstract class n {
    public static void a(android.widget.ImageView imageView, java.lang.String str) {
        if (imageView == null || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        if (com.tencent.mm.ui.bk.C()) {
            str = str + "_dark";
        }
        imageView.setImageResource(imageView.getResources().getIdentifier(str, com.tencent.tinker.loader.shareutil.ShareConstants.DEXMODE_RAW, imageView.getContext().getPackageName()));
    }
}
