package com.tencent.mm.ui.contact;

/* loaded from: classes9.dex */
public final class z2 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f207268d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.ContactSayHiImagePreviewUI f207269e;

    public z2(com.tencent.mm.ui.contact.ContactSayHiImagePreviewUI contactSayHiImagePreviewUI) {
        this.f207269e = contactSayHiImagePreviewUI;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.ArrayList arrayList = this.f207268d;
        if (arrayList == null) {
            return 0;
        }
        kotlin.jvm.internal.o.d(arrayList);
        return arrayList.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        java.util.ArrayList arrayList = this.f207268d;
        if (arrayList == null) {
            return 0;
        }
        kotlin.jvm.internal.o.d(arrayList);
        java.lang.Object obj = arrayList.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        return obj;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup parent) {
        com.tencent.mm.ui.contact.a3 a3Var;
        android.view.View view2;
        kotlin.jvm.internal.o.g(parent, "parent");
        com.tencent.mm.ui.contact.ContactSayHiImagePreviewUI contactSayHiImagePreviewUI = this.f207269e;
        if (view == null) {
            view2 = android.view.View.inflate(contactSayHiImagePreviewUI, com.tencent.mm.R.layout.a2n, null);
            a3Var = new com.tencent.mm.ui.contact.a3(contactSayHiImagePreviewUI);
            android.view.View findViewById = view2.findViewById(com.tencent.mm.R.id.h88);
            kotlin.jvm.internal.o.e(findViewById, "null cannot be cast to non-null type com.tencent.mm.ui.base.MultiTouchImageView");
            a3Var.f206578a = (com.tencent.mm.ui.base.MultiTouchImageView) findViewById;
            view2.setLayoutParams(new android.widget.Gallery.LayoutParams(-1, -1));
            view2.setTag(a3Var);
        } else {
            java.lang.Object tag = view.getTag();
            kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.contact.ContactSayHiImagePreviewUI.ViewHolder");
            a3Var = (com.tencent.mm.ui.contact.a3) tag;
            view2 = view;
        }
        com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView = a3Var.f206578a;
        kotlin.jvm.internal.o.d(multiTouchImageView);
        multiTouchImageView.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1));
        com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView2 = a3Var.f206578a;
        kotlin.jvm.internal.o.d(multiTouchImageView2);
        java.util.ArrayList arrayList = this.f207268d;
        kotlin.jvm.internal.o.d(arrayList);
        java.lang.Object obj = arrayList.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        android.graphics.Bitmap a17 = com.tencent.mm.sdk.platformtools.j.a((java.lang.String) obj, i65.a.g(contactSayHiImagePreviewUI));
        if (a17 != null) {
            android.view.View view3 = contactSayHiImagePreviewUI.f206412e;
            kotlin.jvm.internal.o.d(view3);
            int width = view3.getWidth();
            android.view.View view4 = contactSayHiImagePreviewUI.f206412e;
            kotlin.jvm.internal.o.d(view4);
            int height = view4.getHeight();
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            matrix.reset();
            float width2 = a17.getWidth() / a17.getHeight();
            float f17 = 1.0f;
            if (a17.getHeight() / a17.getWidth() >= 2.0f && a17.getHeight() >= 480) {
                float f18 = width;
                float width3 = f18 / a17.getWidth();
                if (a17.getWidth() / f18 > 1.0d) {
                    matrix.postScale(width3, width3);
                    a17.getHeight();
                    matrix.postTranslate((f18 - (a17.getWidth() * width3)) / 2, 0.0f);
                } else {
                    matrix.postScale(1.0f, 1.0f);
                    matrix.postTranslate((width - a17.getWidth()) / 2, 0.0f);
                }
            } else if (width2 < 2.0f || a17.getWidth() < 480) {
                float f19 = width;
                float width4 = f19 / a17.getWidth();
                float f27 = height;
                float height2 = f27 / a17.getHeight();
                if (width4 >= height2) {
                    width4 = height2;
                }
                float width5 = a17.getWidth() / f19;
                float height3 = a17.getHeight() / f27;
                if (width5 <= height3) {
                    width5 = height3;
                }
                if (width5 > 1.0d) {
                    matrix.postScale(width4, width4);
                    f17 = width4;
                }
                float f28 = 2;
                matrix.postTranslate((f19 - (a17.getWidth() * f17)) / f28, (f27 - (a17.getHeight() * f17)) / f28);
            } else {
                float height4 = a17.getHeight() / 480.0f;
                float height5 = 480.0f / a17.getHeight();
                if (height4 > 1.0d) {
                    matrix.postScale(height4, height5);
                    matrix.postTranslate(0.0f, (height - 480) / 2);
                } else {
                    matrix.postScale(1.0f, 1.0f);
                    matrix.postTranslate(0.0f, (height - a17.getHeight()) / 2);
                }
            }
            multiTouchImageView2.setImageMatrix(matrix);
            int width6 = a17.getWidth();
            int height6 = a17.getHeight();
            multiTouchImageView2.f197651o = width6;
            multiTouchImageView2.f197652p = height6;
            multiTouchImageView2.setImageBitmap(a17);
        }
        return view2;
    }
}
