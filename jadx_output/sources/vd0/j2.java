package vd0;

@j95.b
/* loaded from: classes.dex */
public class j2 extends i95.w implements wd0.q1 {
    public void wi(boolean z17, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SafeSwitchTipDialog", "updateExtStatus2Values onPositionBtn. ConfigStorageLogic.getExtStatus2FromUserInfo() = " + c01.z1.i());
        long i17 = c01.z1.i();
        long j18 = !z17 ? (~j17) & i17 : i17 | j17;
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_EXT_STATUS2_LONG_SYNC, java.lang.Long.valueOf(j18));
        bn0.g.f22779a.g("USERINFO_EXT_STATUS2_LONG_SYNC", j18);
    }
}
