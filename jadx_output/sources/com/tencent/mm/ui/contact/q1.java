package com.tencent.mm.ui.contact;

/* loaded from: classes12.dex */
public class q1 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f207126d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.ContactRemarkImagePreviewUI f207127e;

    public q1(com.tencent.mm.ui.contact.ContactRemarkImagePreviewUI contactRemarkImagePreviewUI) {
        this.f207127e = contactRemarkImagePreviewUI;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.ArrayList arrayList = this.f207126d;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        java.util.ArrayList arrayList = this.f207126d;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.ui.contact.r1 r1Var;
        android.view.View view2;
        float f17;
        com.tencent.mm.ui.contact.ContactRemarkImagePreviewUI contactRemarkImagePreviewUI = this.f207127e;
        if (view == null) {
            view2 = android.view.View.inflate(contactRemarkImagePreviewUI, com.tencent.mm.R.layout.a2n, null);
            r1Var = new com.tencent.mm.ui.contact.r1(contactRemarkImagePreviewUI, null);
            r1Var.f207151a = (com.tencent.mm.ui.base.MultiTouchImageView) view2.findViewById(com.tencent.mm.R.id.h88);
            view2.setLayoutParams(new android.widget.Gallery.LayoutParams(-1, -1));
            view2.setTag(r1Var);
        } else {
            r1Var = (com.tencent.mm.ui.contact.r1) view.getTag();
            view2 = view;
        }
        r1Var.f207151a.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1));
        com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView = r1Var.f207151a;
        android.graphics.Bitmap a17 = com.tencent.mm.sdk.platformtools.j.a((java.lang.String) this.f207126d.get(i17), i65.a.g(contactRemarkImagePreviewUI));
        if (a17 != null) {
            int width = contactRemarkImagePreviewUI.f206361e.getWidth();
            int height = contactRemarkImagePreviewUI.f206361e.getHeight();
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            matrix.reset();
            float width2 = a17.getWidth() / a17.getHeight();
            if (a17.getHeight() / a17.getWidth() >= 2.0f && a17.getHeight() >= 480) {
                float f18 = width;
                float width3 = f18 / a17.getWidth();
                if (a17.getWidth() / f18 > 1.0d) {
                    matrix.postScale(width3, width3);
                    a17.getHeight();
                    matrix.postTranslate((f18 - (a17.getWidth() * width3)) / 2.0f, 0.0f);
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
                } else {
                    f17 = 1.0f;
                }
                matrix.postTranslate((f19 - (a17.getWidth() * f17)) / 2.0f, (f27 - (a17.getHeight() * f17)) / 2.0f);
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
            multiTouchImageView.setImageMatrix(matrix);
            int width6 = a17.getWidth();
            int height6 = a17.getHeight();
            multiTouchImageView.f197651o = width6;
            multiTouchImageView.f197652p = height6;
            multiTouchImageView.setImageBitmap(a17);
        }
        return view2;
    }
}
