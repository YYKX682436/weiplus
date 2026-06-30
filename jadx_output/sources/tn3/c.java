package tn3;

/* loaded from: classes9.dex */
public final class c extends com.tencent.mm.plugin.newtips.model.j {

    /* renamed from: a, reason: collision with root package name */
    public static final tn3.b f420823a = new tn3.b(null);

    @Override // com.tencent.mm.plugin.newtips.model.j
    public boolean a(int i17, java.util.List list) {
        return true;
    }

    @Override // com.tencent.mm.plugin.newtips.model.j
    public boolean b(com.tencent.mm.plugin.newtips.model.k kVar) {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(f420823a.a())) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NewTips.NewTipsIdVoiceInputWetypeFilter", "ifShow no");
        return false;
    }
}
