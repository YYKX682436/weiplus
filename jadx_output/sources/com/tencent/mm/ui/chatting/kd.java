package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class kd implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f201907d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f201908e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f201909f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f201910g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wework.api.IWWAPI.WWAppType f201911h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f201912i;

    public kd(android.content.Context context, com.tencent.mm.storage.z3 z3Var, java.util.List list, boolean z17, com.tencent.wework.api.IWWAPI.WWAppType wWAppType, int i17) {
        this.f201907d = context;
        this.f201908e = z3Var;
        this.f201909f = list;
        this.f201910g = z17;
        this.f201911h = wWAppType;
        this.f201912i = i17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.ui.chatting.hd.a(this.f201907d, this.f201908e, this.f201909f, this.f201910g, this.f201911h, this.f201912i);
    }
}
