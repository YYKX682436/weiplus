package qd2;

/* loaded from: classes2.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qd2.g f361698d;

    public a(qd2.g gVar) {
        this.f361698d = gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (r1.isShowing() == true) goto L8;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r4 = this;
            qd2.g r0 = r4.f361698d
            com.tencent.mm.ui.widget.dialog.u3 r1 = r0.f361731e
            r2 = 0
            if (r1 == 0) goto Lf
            boolean r1 = r1.isShowing()
            r3 = 1
            if (r1 != r3) goto Lf
            goto L10
        Lf:
            r3 = r2
        L10:
            if (r3 == 0) goto L25
            com.tencent.mm.ui.widget.dialog.u3 r1 = r0.f361731e
            if (r1 == 0) goto L19
            r1.dismiss()
        L19:
            androidx.appcompat.app.AppCompatActivity r0 = r0.f361727a
            r1 = 2131762552(0x7f101d78, float:1.9156184E38)
            android.widget.Toast r0 = dp.a.makeText(r0, r1, r2)
            r0.show()
        L25:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qd2.a.run():void");
    }
}
