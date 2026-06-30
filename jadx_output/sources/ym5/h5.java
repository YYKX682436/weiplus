package ym5;

/* loaded from: classes15.dex */
public class h5 extends ym5.i5 implements java.lang.Runnable {

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f463375f;

    /* renamed from: g, reason: collision with root package name */
    public int f463376g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.SmileySubGrid f463377h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(com.tencent.mm.view.SmileySubGrid smileySubGrid, ym5.e5 e5Var) {
        super(smileySubGrid, null);
        this.f463377h = smileySubGrid;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r6 = this;
            java.lang.String r0 = "MicroMsg.emoji.SmileyPanel.SmileySubGrid"
            java.lang.String r1 = "Click run"
            com.tencent.mars.xlog.Log.i(r0, r1)
            com.tencent.mm.view.SmileySubGrid r0 = r6.f463377h
            android.widget.ListAdapter r1 = r0.getAdapter()
            int r2 = r6.f463376g
            if (r1 == 0) goto L41
            int r3 = r0.getCount()
            if (r3 <= 0) goto L41
            r3 = -1
            if (r2 == r3) goto L41
            int r3 = r1.getCount()
            if (r2 >= r3) goto L41
            com.tencent.mm.view.SmileySubGrid r3 = r6.f463388e
            boolean r4 = r3.hasWindowFocus()
            if (r4 == 0) goto L32
            int r3 = com.tencent.mm.view.SmileySubGrid.c(r3)
            int r4 = r6.f463387d
            if (r3 != r4) goto L32
            r3 = 1
            goto L33
        L32:
            r3 = 0
        L33:
            if (r3 == 0) goto L41
            r1.getItemId(r2)
            android.view.View r3 = r6.f463375f
            long r4 = r1.getItemId(r2)
            r0.performItemClick(r3, r2, r4)
        L41:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ym5.h5.run():void");
    }
}
