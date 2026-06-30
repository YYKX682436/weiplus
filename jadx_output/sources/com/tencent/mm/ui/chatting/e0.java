package com.tencent.mm.ui.chatting;

/* loaded from: classes8.dex */
public class e0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f200448d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f200449e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f200450f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f200451g;

    public e0(com.tencent.mm.ui.chatting.AppAttachNewDownloadUI appAttachNewDownloadUI, java.lang.String str, java.util.List list, java.util.List list2, java.lang.String str2) {
        this.f200448d = str;
        this.f200449e = list;
        this.f200450f = list2;
        this.f200451g = str2;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        java.lang.String str = this.f200448d;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            g4Var.setHeaderTitle(str);
        }
        int i17 = 0;
        while (true) {
            java.util.List list = this.f200449e;
            if (i17 >= list.size()) {
                break;
            }
            g4Var.f(((java.lang.Integer) this.f200450f.get(i17)).intValue(), (java.lang.CharSequence) list.get(i17));
            i17++;
        }
        java.lang.String str2 = this.f200451g;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return;
        }
        g4Var.f(-1, str2);
    }
}
