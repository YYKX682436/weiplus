package hk2;

/* loaded from: classes2.dex */
public final class c implements sr.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.api.IEmojiInfo f281882a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f281883b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.widget.ProgressBar f281884c;

    public c(com.tencent.mm.api.IEmojiInfo iEmojiInfo, android.widget.LinearLayout linearLayout, android.widget.ProgressBar progressBar) {
        this.f281882a = iEmojiInfo;
        this.f281883b = linearLayout;
        this.f281884c = progressBar;
    }

    @Override // sr.b
    public void a(int i17) {
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = this.f281882a;
        boolean E0 = iEmojiInfo.E0();
        android.widget.LinearLayout linearLayout = this.f281883b;
        if (!E0 && i17 != 1) {
            android.widget.ProgressBar progressBar = this.f281884c;
            if (i17 == 0) {
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                if (progressBar != null) {
                    progressBar.setVisibility(0);
                }
            } else if (i17 != -1) {
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                if (progressBar != null) {
                    progressBar.setVisibility(8);
                }
            } else if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
        } else if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("emojiStatus ");
        sb6.append(i17);
        sb6.append(" md5 ");
        java.lang.String md52 = iEmojiInfo.getMd5();
        if (md52 == null) {
            md52 = "";
        }
        sb6.append(md52);
        com.tencent.mars.xlog.Log.i("DanmakuItemEmoji", sb6.toString());
    }
}
