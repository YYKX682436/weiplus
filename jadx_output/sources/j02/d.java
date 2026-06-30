package j02;

/* loaded from: classes8.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader.ui.GameCloudAppDownloadUI f296982d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.mm.plugin.downloader.ui.GameCloudAppDownloadUI gameCloudAppDownloadUI) {
        super(0);
        this.f296982d = gameCloudAppDownloadUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View inflate = android.view.LayoutInflater.from(this.f296982d.getContext()).inflate(com.tencent.mm.R.layout.bf9, (android.view.ViewGroup) null, false);
        int i17 = com.tencent.mm.R.id.azd;
        android.widget.Button button = (android.widget.Button) x4.b.a(inflate, com.tencent.mm.R.id.azd);
        if (button != null) {
            i17 = com.tencent.mm.R.id.aze;
            android.widget.Button button2 = (android.widget.Button) x4.b.a(inflate, com.tencent.mm.R.id.aze);
            if (button2 != null) {
                i17 = com.tencent.mm.R.id.j2i;
                android.widget.Button button3 = (android.widget.Button) x4.b.a(inflate, com.tencent.mm.R.id.j2i);
                if (button3 != null) {
                    i17 = com.tencent.mm.R.id.f483477j53;
                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(inflate, com.tencent.mm.R.id.f483477j53);
                    if (linearLayout != null) {
                        i17 = com.tencent.mm.R.id.f483478j55;
                        android.widget.Button button4 = (android.widget.Button) x4.b.a(inflate, com.tencent.mm.R.id.f483478j55);
                        if (button4 != null) {
                            i17 = com.tencent.mm.R.id.r5y;
                            android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) x4.b.a(inflate, com.tencent.mm.R.id.r5y);
                            if (linearLayout2 != null) {
                                i17 = com.tencent.mm.R.id.r5z;
                                com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(inflate, com.tencent.mm.R.id.r5z);
                                if (weImageView != null) {
                                    i17 = com.tencent.mm.R.id.hku;
                                    android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(inflate, com.tencent.mm.R.id.hku);
                                    if (imageView != null) {
                                        i17 = com.tencent.mm.R.id.hkw;
                                        com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = (com.tencent.mm.ui.widget.MMRoundCornerImageView) x4.b.a(inflate, com.tencent.mm.R.id.hkw);
                                        if (mMRoundCornerImageView != null) {
                                            i17 = com.tencent.mm.R.id.r7s;
                                            android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) x4.b.a(inflate, com.tencent.mm.R.id.r7s);
                                            if (linearLayout3 != null) {
                                                i17 = com.tencent.mm.R.id.r7t;
                                                android.widget.LinearLayout linearLayout4 = (android.widget.LinearLayout) x4.b.a(inflate, com.tencent.mm.R.id.r7t);
                                                if (linearLayout4 != null) {
                                                    i17 = com.tencent.mm.R.id.r7u;
                                                    android.widget.LinearLayout linearLayout5 = (android.widget.LinearLayout) x4.b.a(inflate, com.tencent.mm.R.id.r7u);
                                                    if (linearLayout5 != null) {
                                                        i17 = com.tencent.mm.R.id.f487411r94;
                                                        android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.f487411r94);
                                                        if (textView != null) {
                                                            i17 = com.tencent.mm.R.id.okx;
                                                            android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.okx);
                                                            if (textView2 != null) {
                                                                i17 = com.tencent.mm.R.id.oky;
                                                                android.widget.TextView textView3 = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.oky);
                                                                if (textView3 != null) {
                                                                    i17 = com.tencent.mm.R.id.oma;
                                                                    android.widget.TextView textView4 = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.oma);
                                                                    if (textView4 != null) {
                                                                        i17 = com.tencent.mm.R.id.r98;
                                                                        android.widget.TextView textView5 = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.r98);
                                                                        if (textView5 != null) {
                                                                            i17 = com.tencent.mm.R.id.onn;
                                                                            android.widget.TextView textView6 = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.onn);
                                                                            if (textView6 != null) {
                                                                                i17 = com.tencent.mm.R.id.r99;
                                                                                android.widget.TextView textView7 = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.r99);
                                                                                if (textView7 != null) {
                                                                                    return new b02.a((android.widget.LinearLayout) inflate, button, button2, button3, linearLayout, button4, linearLayout2, weImageView, imageView, mMRoundCornerImageView, linearLayout3, linearLayout4, linearLayout5, textView, textView2, textView3, textView4, textView5, textView6, textView7);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
    }
}
