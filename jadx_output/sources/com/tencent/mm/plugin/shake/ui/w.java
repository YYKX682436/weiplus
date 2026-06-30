package com.tencent.mm.plugin.shake.ui;

/* loaded from: classes11.dex */
public class w implements bb5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.shake.ui.y f162338a;

    public w(com.tencent.mm.plugin.shake.ui.y yVar) {
        this.f162338a = yVar;
    }

    @Override // bb5.e
    public int a() {
        return this.f162338a.getCount();
    }

    @Override // bb5.e
    public java.lang.String b(int i17) {
        if (i17 >= 0) {
            com.tencent.mm.plugin.shake.ui.y yVar = this.f162338a;
            if (i17 < yVar.getCount()) {
                c34.r rVar = (c34.r) yVar.getItem(i17);
                if (rVar == null) {
                    return null;
                }
                return rVar.field_username;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.ShakeFriendAdapter", "pos is invalid");
        return null;
    }
}
