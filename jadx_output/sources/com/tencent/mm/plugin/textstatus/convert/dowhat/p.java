package com.tencent.mm.plugin.textstatus.convert.dowhat;

/* loaded from: classes11.dex */
public final class p implements com.tencent.mm.plugin.textstatus.convert.dowhat.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.convert.dowhat.u f173246a;

    public p(com.tencent.mm.plugin.textstatus.convert.dowhat.u uVar) {
        this.f173246a = uVar;
    }

    @Override // com.tencent.mm.plugin.textstatus.convert.dowhat.u
    public void a(android.view.View v17, java.lang.String iconId) {
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(iconId, "iconId");
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.DoWhatItemGroupConvert", "onItemClick: iconId:".concat(iconId));
        this.f173246a.a(v17, iconId);
    }
}
