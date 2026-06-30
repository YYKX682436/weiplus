package zy4;

/* loaded from: classes15.dex */
public class b implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.welab.ui.WelabAppInfoUI f477674a;

    public b(com.tencent.mm.plugin.welab.ui.WelabAppInfoUI welabAppInfoUI) {
        this.f477674a = welabAppInfoUI;
    }

    @Override // al5.c2
    public void onStatusChange(boolean z17) {
        yy4.a aVar = this.f477674a.f188083e;
        int i17 = aVar.field_Switch;
        if (i17 == 2) {
            aVar.field_Switch = 1;
        } else if (i17 == 1) {
            aVar.field_Switch = 2;
        }
    }
}
