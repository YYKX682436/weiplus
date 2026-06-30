package ns2;

/* loaded from: classes2.dex */
public final class r extends ns2.o {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f339419d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r(androidx.appcompat.app.AppCompatActivity r9, androidx.fragment.app.Fragment r10, java.util.List r11, java.lang.String r12, int r13, kotlin.jvm.internal.i r14) {
        /*
            r8 = this;
            r13 = r13 & 8
            if (r13 == 0) goto L6
            java.lang.String r12 = ""
        L6:
            r5 = r12
            java.lang.String r12 = "activity"
            kotlin.jvm.internal.o.g(r9, r12)
            java.lang.String r12 = "weImageDatas"
            kotlin.jvm.internal.o.g(r11, r12)
            java.lang.String r12 = "name"
            kotlin.jvm.internal.o.g(r5, r12)
            r3 = 0
            r4 = 0
            r6 = 8
            r7 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.f339419d = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ns2.r.<init>(androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.Fragment, java.util.List, java.lang.String, int, kotlin.jvm.internal.i):void");
    }

    @Override // ns2.l
    public void a() {
        android.view.KeyEvent.Callback findViewById;
        for (jz5.l lVar : this.f339419d) {
            int intValue = ((java.lang.Number) lVar.f302833d).intValue();
            androidx.fragment.app.Fragment fragment = this.f339415b;
            if (fragment != null) {
                android.view.View view = fragment.getView();
                findViewById = view != null ? view.findViewById(intValue) : null;
            } else {
                findViewById = this.f339414a.findViewById(intValue);
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = findViewById instanceof com.tencent.mm.ui.widget.imageview.WeImageView ? (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById : null;
            if (weImageView != null) {
                weImageView.setImageResource(((java.lang.Number) lVar.f302834e).intValue());
            }
        }
    }
}
