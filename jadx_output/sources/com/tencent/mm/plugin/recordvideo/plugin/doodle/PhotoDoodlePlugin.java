package com.tencent.mm.plugin.recordvideo.plugin.doodle;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\f=B\u0019\u0012\u0006\u00108\u001a\u000207\u0012\b\u0010:\u001a\u0004\u0018\u000109¢\u0006\u0004\b;\u0010<J\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0016R*\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010!\u001a\u0004\u0018\u00010\u001a8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010)\u001a\u0004\u0018\u00010\"8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u00100\u001a\u00020\u00038\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u00103\u001a\u00020\u00038\u0004X\u0084D¢\u0006\f\n\u0004\b1\u0010+\u001a\u0004\b2\u0010-R\u001a\u00106\u001a\u00020\u00038\u0004X\u0084D¢\u0006\f\n\u0004\b4\u0010+\u001a\u0004\b5\u0010-¨\u0006>"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/plugin/doodle/PhotoDoodlePlugin;", "Landroid/widget/RelativeLayout;", "Lyt3/r2;", "", "getLayout", "Lju3/d0;", "status", "Ljz5/f0;", "setStatus", "visibility", "setVisibility", "Ljava/util/ArrayList;", "Lbu3/g;", "Lkotlin/collections/ArrayList;", "d", "Ljava/util/ArrayList;", "getResourceArray", "()Ljava/util/ArrayList;", "resourceArray", "e", "Lju3/d0;", "getMStatus", "()Lju3/d0;", "setMStatus", "(Lju3/d0;)V", "mStatus", "Landroid/widget/ImageView;", "f", "Landroid/widget/ImageView;", "getUnDoImageView", "()Landroid/widget/ImageView;", "setUnDoImageView", "(Landroid/widget/ImageView;)V", "unDoImageView", "Landroid/widget/GridView;", "g", "Landroid/widget/GridView;", "getColorList", "()Landroid/widget/GridView;", "setColorList", "(Landroid/widget/GridView;)V", "colorList", "h", "I", "getSelectType", "()I", "setSelectType", "(I)V", "selectType", "i", "getImageSizeDP", "imageSizeDP", "m", "getPaddingDp", "paddingDp", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "bu3/h", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public class PhotoDoodlePlugin extends android.widget.RelativeLayout implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final java.util.ArrayList resourceArray;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public ju3.d0 mStatus;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public android.widget.ImageView unDoImageView;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public android.widget.GridView colorList;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public int selectType;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final int imageSizeDP;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final int paddingDp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhotoDoodlePlugin(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.resourceArray = arrayList;
        this.selectType = 2;
        this.imageSizeDP = 34;
        this.paddingDp = 6;
        android.view.LayoutInflater.from(getContext()).inflate(getLayout(), (android.view.ViewGroup) this, true);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.llb);
        this.unDoImageView = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.icons_filled_previous, -1));
        }
        android.widget.ImageView imageView2 = this.unDoImageView;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new bu3.i(this));
        }
        this.colorList = (android.widget.GridView) findViewById(com.tencent.mm.R.id.f483832c61);
        android.content.res.Resources resources = getContext().getResources();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.c6w));
        arrayList2.add(resources);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj, arrayList2.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/doodle/PhotoDoodlePlugin", "initView", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList2.get(0), ((java.lang.Integer) arrayList2.get(1)).intValue());
        yj0.a.e(obj, decodeResource, "com/tencent/mm/plugin/recordvideo/plugin/doodle/PhotoDoodlePlugin", "initView", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        android.content.res.Resources resources2 = getContext().getResources();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.c6z));
        arrayList3.add(resources2);
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(obj2, arrayList3.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/doodle/PhotoDoodlePlugin", "initView", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeResource2 = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList3.get(0), ((java.lang.Integer) arrayList3.get(1)).intValue());
        yj0.a.e(obj2, decodeResource2, "com/tencent/mm/plugin/recordvideo/plugin/doodle/PhotoDoodlePlugin", "initView", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        a(decodeResource2, decodeResource);
        android.widget.GridView gridView = this.colorList;
        if (gridView != null) {
            gridView.setAdapter((android.widget.ListAdapter) new bu3.h(this, arrayList));
        }
        android.widget.GridView gridView2 = this.colorList;
        if (gridView2 == null) {
            return;
        }
        gridView2.setOnItemClickListener(new bu3.j(this));
    }

    public final void a(android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2) {
        java.util.ArrayList arrayList = this.resourceArray;
        arrayList.clear();
        if (bitmap != null) {
            bu3.g gVar = new bu3.g();
            gVar.f24601a = bitmap;
            gVar.f24603c = 99;
            arrayList.add(gVar);
        }
        if (bitmap2 != null) {
            bu3.g gVar2 = new bu3.g();
            gVar2.f24601a = bitmap2;
            gVar2.f24603c = 100;
            arrayList.add(gVar2);
        }
        bu3.g gVar3 = new bu3.g();
        gVar3.f24602b = -1;
        gVar3.f24603c = 0;
        arrayList.add(gVar3);
        bu3.g gVar4 = new bu3.g();
        gVar4.f24602b = -16777216;
        gVar4.f24603c = 1;
        arrayList.add(gVar4);
        bu3.g gVar5 = new bu3.g();
        gVar5.f24602b = -707825;
        gVar5.f24603c = 2;
        arrayList.add(gVar5);
        bu3.g gVar6 = new bu3.g();
        gVar6.f24602b = -17592;
        gVar6.f24603c = 3;
        arrayList.add(gVar6);
        bu3.g gVar7 = new bu3.g();
        gVar7.f24602b = -16535286;
        gVar7.f24603c = 4;
        arrayList.add(gVar7);
        bu3.g gVar8 = new bu3.g();
        gVar8.f24602b = -15172610;
        gVar8.f24603c = 5;
        arrayList.add(gVar8);
        bu3.g gVar9 = new bu3.g();
        gVar9.f24602b = -7054596;
        gVar9.f24603c = 6;
        arrayList.add(gVar9);
    }

    public final void b(int i17) {
        if (i17 == 99) {
            ju3.d0 d0Var = this.mStatus;
            if (d0Var != null) {
                ju3.d0.k(d0Var, ju3.c0.N1, null, 2, null);
                return;
            }
            return;
        }
        if (i17 == 100) {
            ju3.d0 d0Var2 = this.mStatus;
            if (d0Var2 != null) {
                ju3.d0.k(d0Var2, ju3.c0.O1, null, 2, null);
                return;
            }
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("EDIT_PHOTO_DOODLE_PENCIL_INDEX_INT", i17);
        ju3.d0 d0Var3 = this.mStatus;
        if (d0Var3 != null) {
            d0Var3.w(ju3.c0.P1, bundle);
        }
    }

    public final android.widget.GridView getColorList() {
        return this.colorList;
    }

    public final int getImageSizeDP() {
        return this.imageSizeDP;
    }

    public final int getLayout() {
        return com.tencent.mm.R.layout.c9m;
    }

    public final ju3.d0 getMStatus() {
        return this.mStatus;
    }

    public final int getPaddingDp() {
        return this.paddingDp;
    }

    public final java.util.ArrayList<bu3.g> getResourceArray() {
        return this.resourceArray;
    }

    public final int getSelectType() {
        return this.selectType;
    }

    public final android.widget.ImageView getUnDoImageView() {
        return this.unDoImageView;
    }

    @Override // yt3.r2
    public boolean onBackPress() {
        if (getVisibility() != 0) {
            return false;
        }
        setVisibility(4);
        return true;
    }

    public final void setColorList(android.widget.GridView gridView) {
        this.colorList = gridView;
    }

    public final void setMStatus(ju3.d0 d0Var) {
        this.mStatus = d0Var;
    }

    public final void setSelectType(int i17) {
        this.selectType = i17;
    }

    public final void setStatus(ju3.d0 status) {
        kotlin.jvm.internal.o.g(status, "status");
        this.mStatus = status;
    }

    public final void setUnDoImageView(android.widget.ImageView imageView) {
        this.unDoImageView = imageView;
    }

    @Override // android.view.View, yt3.r2
    public void setVisibility(int i17) {
        android.view.View childAt;
        super.setVisibility(i17);
        if (i17 == 0) {
            int i18 = 0;
            for (java.lang.Object obj : this.resourceArray) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                android.widget.GridView gridView = this.colorList;
                if ((gridView != null ? gridView.getChildAt(i18) : null) != null) {
                    android.widget.GridView gridView2 = this.colorList;
                    android.view.View childAt2 = gridView2 != null ? gridView2.getChildAt(i18) : null;
                    kotlin.jvm.internal.o.e(childAt2, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.plugin.doodle.ClickBigImageView");
                    if (((bu3.a) childAt2).getType() != this.selectType) {
                        android.widget.GridView gridView3 = this.colorList;
                        childAt = gridView3 != null ? gridView3.getChildAt(i18) : null;
                        kotlin.jvm.internal.o.e(childAt, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.plugin.doodle.ClickBigImageView");
                        ((bu3.a) childAt).setHasSelected(false);
                    } else {
                        android.widget.GridView gridView4 = this.colorList;
                        childAt = gridView4 != null ? gridView4.getChildAt(i18) : null;
                        kotlin.jvm.internal.o.e(childAt, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.plugin.doodle.ClickBigImageView");
                        ((bu3.a) childAt).setHasSelected(true);
                    }
                }
                i18 = i19;
            }
            b(this.selectType);
        }
        android.widget.GridView gridView5 = this.colorList;
        if (gridView5 != null) {
            gridView5.setVisibility(i17);
        }
        android.widget.ImageView imageView = this.unDoImageView;
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(i17);
    }
}
