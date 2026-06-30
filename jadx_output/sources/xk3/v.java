package xk3;

/* loaded from: classes8.dex */
public final class v extends xk3.i {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f455063i;

    public v(vk3.a aVar) {
        super(com.tencent.mm.R.layout.bxn, aVar);
        this.f455063i = "MicroMsg.VideoMinusScreenRoundCornerConvert";
    }

    @Override // xk3.i, in5.r
    public void g(androidx.recyclerview.widget.RecyclerView recyclerView, com.tencent.mm.view.recyclerview.WxRecyclerAdapter adapter) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(adapter, "adapter");
        super.g(recyclerView, adapter);
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String string;
        uk3.a item = (uk3.a) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.p(holder, item, i17, i18, z17, list);
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = item.f428524d;
        r45.lr4 v07 = multiTaskInfo.v0();
        android.widget.TextView textView = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.jvj);
        android.widget.ImageView imageView = (android.widget.ImageView) holder.itemView.findViewById(com.tencent.mm.R.id.jvb);
        android.widget.ImageView imageView2 = (android.widget.ImageView) holder.itemView.findViewById(com.tencent.mm.R.id.jvc);
        boolean n17 = com.tencent.mm.sdk.platformtools.x2.n();
        yo0.i imageLoaderOption = this.f455041g;
        if (n17) {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            ya2.l lVar = ya2.l.f460502a;
            kotlin.jvm.internal.o.d(imageView);
            zy2.v8.c(lVar, imageView, (v07 == null || (string = v07.getString(5)) == null) ? "" : string, null, 4, null);
        } else {
            vo0.a aVar = vo0.e.f438468b;
            if (v07 == null || (str = v07.getString(5)) == null) {
                str = "";
            }
            kotlin.jvm.internal.o.d(imageView);
            aVar.c(str, imageView, imageLoaderOption);
        }
        wk3.a aVar2 = wk3.a.f446957a;
        kotlin.jvm.internal.o.d(textView);
        if (v07 == null || (str2 = v07.getString(0)) == null) {
            str2 = "";
        }
        textView.setText(aVar2.c(textView, str2, this.f455042h));
        mn2.g1 g1Var = mn2.g1.f329975a;
        boolean z18 = true;
        if (v07 != null) {
            kotlin.jvm.internal.o.d(imageView2);
            int integer = v07.getInteger(6);
            java.lang.String string2 = v07.getString(2);
            kotlin.jvm.internal.o.g(imageLoaderOption, "imageLoaderOption");
            imageView2.setVisibility(8);
            android.graphics.drawable.Drawable drawable = imageView2.getDrawable();
            if (drawable != null) {
                drawable.setColorFilter(null);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MinusScreen.ViewUtils", "authType = " + integer + ", authIconUrl = " + string2);
            imageView2.setVisibility(0);
            if (integer <= 0) {
                imageView2.setVisibility(8);
            } else if (integer == 1) {
                if (string2 == null || string2.length() == 0) {
                    imageView2.setImageDrawable(com.tencent.mm.ui.uk.e(imageView2.getContext(), com.tencent.mm.R.raw.icons_filled_star_identify, i65.a.d(imageView2.getContext(), com.tencent.mm.R.color.Orange_100)));
                } else if (com.tencent.mm.sdk.platformtools.x2.n()) {
                    vo0.d e17 = g1Var.e();
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                    e17.c(ya2.l.f460502a.e(string2, com.tencent.mm.plugin.finder.storage.y90.f128355e), imageView2, g1Var.h(mn2.f1.f329953d));
                } else {
                    vo0.e.f438468b.c(string2, imageView2, imageLoaderOption);
                }
            } else if (integer == 2) {
                imageView2.setImageResource(com.tencent.mm.R.raw.icons_filled_star_identify_enterprise);
            } else if (integer != 100) {
                imageView2.setVisibility(8);
            } else {
                imageView2.setVisibility(8);
            }
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.jve);
        weImageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_playbtn);
        weImageView.setIconColor(holder.f293121e.getResources().getColor(com.tencent.mm.R.color.f478553an));
        if (v07.getBoolean(7)) {
            weImageView.setVisibility(8);
        } else {
            weImageView.setVisibility(0);
        }
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.jvi);
        int integer2 = multiTaskInfo.v0().getInteger(3);
        textView2.setText(o(integer2 / 60) + ':' + o(integer2 % 60));
        textView2.setVisibility(8);
        com.tencent.mm.ui.MMImageView mMImageView = (com.tencent.mm.ui.MMImageView) holder.itemView.findViewById(com.tencent.mm.R.id.jvo);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.itemView.findViewById(com.tencent.mm.R.id.jvg);
        if (multiTaskInfo.field_type == 25) {
            mMImageView.setBackground(new android.graphics.drawable.ColorDrawable(-16777216));
            mMImageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
            return;
        }
        if (mMImageView.getVisibility() == 8) {
            r45.yj4 yj4Var = new r45.yj4();
            try {
                yj4Var.parseFrom(multiTaskInfo.field_data);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e(this.f455063i, "MegaVideoFloatBallInfo parse fail", th6);
            }
            java.lang.String string3 = yj4Var.getString(10);
            if (string3 == null) {
                string3 = "";
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(string3)) {
                z18 = false;
            } else {
                mMImageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
                mMImageView.setBackgroundColor(-16777216);
                if (com.tencent.mm.sdk.platformtools.x2.n()) {
                    vo0.d e18 = g1Var.e();
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                    wo0.c b17 = e18.b(ya2.l.f460502a.e(string3, com.tencent.mm.plugin.finder.storage.y90.f128356f), g1Var.h(mn2.f1.f329953d));
                    xk3.s sVar = new xk3.s(mMImageView);
                    b17.getClass();
                    b17.f447873d = sVar;
                    b17.c(mMImageView);
                } else {
                    vo0.e.f438468b.h(string3, mMImageView, imageLoaderOption, new xk3.u(mMImageView));
                }
            }
            if (z18) {
                mMImageView.setVisibility(0);
                weImageView2.setVisibility(8);
                weImageView.setVisibility(0);
                return;
            }
        }
        mMImageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        mMImageView.setBackground(null);
    }

    @Override // xk3.i, in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
    }

    @Override // xk3.i
    public java.lang.String n(android.content.Context context, uk3.a item) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = item.f428524d;
        return com.tencent.mm.sdk.platformtools.t8.K0(multiTaskInfo.v0().getString(0)) ? context.getResources().getString(com.tencent.mm.R.string.gvh) : multiTaskInfo.v0().getString(0);
    }

    @Override // xk3.i
    public void q(android.graphics.Bitmap bitmap, android.widget.ImageView imgView) {
        kotlin.jvm.internal.o.g(bitmap, "bitmap");
        kotlin.jvm.internal.o.g(imgView, "imgView");
        super.q(bitmap, imgView);
        pm0.v.X(new xk3.q(bitmap, imgView));
    }
}
