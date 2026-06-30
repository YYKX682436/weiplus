package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class a7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f207440d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.b7 f207441e;

    public a7(com.tencent.mm.ui.conversation.b7 b7Var, java.lang.Integer num) {
        this.f207441e = b7Var;
        this.f207440d = num;
    }

    @Override // java.lang.Runnable
    public void run() {
        int firstVisiblePosition;
        int i17;
        java.lang.String str;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.ui.conversation.b7 b7Var = this.f207441e;
        long j17 = currentTimeMillis - b7Var.f207480d;
        com.tencent.mm.ui.conversation.MainUI mainUI = b7Var.f207483g;
        if ((j17 >= 3000 || (firstVisiblePosition = b7Var.f207481e) < 0) && (firstVisiblePosition = (mainUI.f207372o.getFirstVisiblePosition() - mainUI.f207372o.getHeaderViewsCount()) + 1) < 0) {
            firstVisiblePosition = 0;
        }
        yf5.j0 j0Var = mainUI.f207379v;
        boolean z17 = com.tencent.mm.ui.conversation.w3.f208214g.c() > 0;
        yf5.w0 w0Var = (yf5.w0) j0Var;
        int i18 = w0Var.f461985q.f461844a;
        if (i18 > 0) {
            i17 = (int) java.lang.Math.abs((firstVisiblePosition + 1) % i18);
            while (i17 != firstVisiblePosition) {
                com.tencent.mm.storage.l4 item = w0Var.getItem(i17);
                if (item != null && ((item.d1() > 0 || item.f1() > 0) && (!z17 || com.tencent.mm.ui.conversation.w3.b(item) == 2))) {
                    break;
                } else {
                    i17 = (i17 + 1) % i18;
                }
            }
        }
        i17 = -1;
        if (i17 < 0) {
            com.tencent.mm.ui.conversation.b7.a(b7Var, mainUI.f207372o.getHeaderViewsCount());
        } else {
            com.tencent.mm.ui.conversation.b7.a(b7Var, mainUI.f207372o.getHeaderViewsCount() + i17);
        }
        b7Var.f207480d = currentTimeMillis;
        b7Var.f207481e = i17 < 0 ? 0 : i17;
        com.tencent.mm.storage.l4 item2 = ((yf5.w0) mainUI.f207379v).getItem(i17);
        fg5.c.f262501a.a(2L, this.f207440d.intValue(), item2, mainUI.f207379v);
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Integer.valueOf(mainUI.f207372o.getHeaderViewsCount());
        objArr[1] = java.lang.Integer.valueOf(firstVisiblePosition);
        objArr[2] = java.lang.Integer.valueOf(i17);
        if (item2 == null || (str = item2.h1()) == null) {
            str = "";
        }
        objArr[3] = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.MainUI", "headerCount %d, scroll from %d to %d, usr:%s", objArr);
    }
}
