package xr1;

/* loaded from: classes9.dex */
public final class j extends com.tencent.mm.modelbase.i {
    public j(r45.ip3 oldSettingResp, boolean z17) {
        kotlin.jvm.internal.o.g(oldSettingResp, "oldSettingResp");
        r45.x26 x26Var = new r45.x26();
        x26Var.f389700d = oldSettingResp.f377249d;
        x26Var.f389701e = oldSettingResp.f377251f;
        xr1.o[] oVarArr = xr1.o.f456207d;
        x26Var.f389702f = z17 ? 2 : 1;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = x26Var;
        lVar.f70665b = new r45.y26();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/timeline/settimelinesetting";
        lVar.f70667d = 1460;
        p(lVar.a());
    }
}
