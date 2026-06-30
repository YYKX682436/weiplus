package com.tencent.mm.plugin.game;

/* loaded from: classes5.dex */
public class r0 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f140622d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f140623e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.p0 f140624f;

    public r0(com.tencent.mm.plugin.game.p0 p0Var, android.content.Intent intent, android.content.Context context) {
        this.f140624f = p0Var;
        this.f140622d = intent;
        this.f140623e = context;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        android.content.Intent intent = this.f140622d;
        if (iPCString == null || com.tencent.mm.sdk.platformtools.t8.K0(iPCString.f68406d)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameExternalService", "localId is null");
            intent.putExtra(dm.i4.COL_LOCALID, "");
        } else {
            intent.putExtra(dm.i4.COL_LOCALID, iPCString.f68406d);
        }
        this.f140624f.cj(this.f140623e, intent);
    }
}
