package ns2;

/* loaded from: classes2.dex */
public final class q extends ns2.o {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Integer f339418d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public q(androidx.appcompat.app.AppCompatActivity r12, androidx.fragment.app.Fragment r13, java.lang.Integer r14, java.util.List r15, java.lang.String r16, int r17, kotlin.jvm.internal.i r18) {
        /*
            r11 = this;
            r0 = r17 & 4
            r1 = 0
            if (r0 == 0) goto L7
            r0 = r1
            goto L8
        L7:
            r0 = r14
        L8:
            r2 = r17 & 8
            if (r2 == 0) goto Le
            r6 = r1
            goto Lf
        Le:
            r6 = r15
        Lf:
            r1 = r17 & 16
            if (r1 == 0) goto L17
            java.lang.String r1 = ""
            r8 = r1
            goto L19
        L17:
            r8 = r16
        L19:
            java.lang.String r1 = "activity"
            r2 = r12
            kotlin.jvm.internal.o.g(r12, r1)
            java.lang.String r1 = "name"
            kotlin.jvm.internal.o.g(r8, r1)
            r7 = 0
            r9 = 8
            r10 = 0
            r3 = r11
            r4 = r12
            r5 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r1 = r11
            r1.f339418d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ns2.q.<init>(androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.Fragment, java.lang.Integer, java.util.List, java.lang.String, int, kotlin.jvm.internal.i):void");
    }

    @Override // ns2.l
    public void a() {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView;
        for (android.view.View view : this.f339416c) {
            java.lang.Integer num = this.f339418d;
            if (num != null) {
                int intValue = num.intValue();
                weImageView = view instanceof com.tencent.mm.ui.widget.imageview.WeImageView ? (com.tencent.mm.ui.widget.imageview.WeImageView) view : null;
                if (weImageView != null) {
                    weImageView.setIconColor(intValue);
                }
            } else {
                boolean z17 = view instanceof com.tencent.mm.ui.widget.imageview.WeImageView;
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = z17 ? (com.tencent.mm.ui.widget.imageview.WeImageView) view : null;
                if (weImageView2 != null) {
                    weImageView2.setIconColor(0);
                }
                weImageView = z17 ? (com.tencent.mm.ui.widget.imageview.WeImageView) view : null;
                if (weImageView != null) {
                    weImageView.clearColorFilter();
                }
            }
        }
    }
}
