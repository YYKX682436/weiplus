package tv2;

/* loaded from: classes2.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db2.p2 f422306d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ab4 f422307e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tv2.m f422308f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(db2.p2 p2Var, r45.ab4 ab4Var, tv2.m mVar) {
        super(1);
        this.f422306d = p2Var;
        this.f422307e = ab4Var;
        this.f422308f = mVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.q23 q23Var;
        java.lang.String str;
        java.lang.Object m521constructorimpl;
        r45.vx2 it = (r45.vx2) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.protobuf.g byteString = it.getByteString(2);
        java.lang.String string = it.getString(1);
        db2.p2 p2Var = this.f422306d;
        p2Var.getClass();
        r45.ab4 createTemplateInfo = this.f422307e;
        kotlin.jvm.internal.o.g(createTemplateInfo, "createTemplateInfo");
        com.tencent.mars.xlog.Log.i("Finder.LogPost.CgiFinderPost", "setEffectCreateData ecContext:" + byteString + ", templateId:" + string);
        r45.hq2 hq2Var = p2Var.f228114w;
        hq2Var.set(38, byteString);
        com.tencent.mm.protocal.protobuf.FinderObjectDesc finderObjectDesc = (com.tencent.mm.protocal.protobuf.FinderObjectDesc) hq2Var.getCustom(2);
        if (finderObjectDesc == null || (q23Var = finderObjectDesc.getVideo_tmpl_info()) == null) {
            q23Var = new r45.q23();
        }
        q23Var.f383585d = string;
        q23Var.f383586e = createTemplateInfo.getInteger(6);
        q23Var.C = createTemplateInfo.getString(4);
        com.tencent.mm.protocal.protobuf.FinderObjectDesc finderObjectDesc2 = (com.tencent.mm.protocal.protobuf.FinderObjectDesc) hq2Var.getCustom(2);
        if (finderObjectDesc2 != null) {
            finderObjectDesc2.setVideo_tmpl_info(q23Var);
        }
        java.lang.String string2 = it.getString(1);
        tv2.m mVar = this.f422308f;
        mVar.getClass();
        boolean z17 = string2 == null || string2.length() == 0;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (!z17) {
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem = mVar.f422315h;
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = finderItem.field_reportObject;
            if (finderFeedReportObject == null || (str = finderFeedReportObject.getTempateInfo()) == null) {
                str = "";
            }
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                org.json.JSONObject jSONObject = str.length() > 0 ? new org.json.JSONObject(r26.i0.t(str, ";", ",", false)) : new org.json.JSONObject();
                jSONObject.put("child_effect_id", string2);
                com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject2 = finderItem.field_reportObject;
                if (finderFeedReportObject2 != null) {
                    java.lang.String jSONObject2 = jSONObject.toString();
                    kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                    finderFeedReportObject2.setTempateInfo(r26.i0.t(jSONObject2, ",", ";", false));
                }
                m521constructorimpl = kotlin.Result.m521constructorimpl(f0Var);
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            }
            java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
            if (m524exceptionOrNullimpl != null) {
                com.tencent.mars.xlog.Log.e(mVar.f422317m, "updateTemplateChildIdInfo failed, localId:" + finderItem.getLocalId() + ", childTemplateId:" + string2 + ", reportTemplateInfoLength:" + str.length(), m524exceptionOrNullimpl);
            }
        }
        mVar.m(p2Var);
        java.lang.String string3 = it.getString(1);
        com.tencent.mm.autogen.events.FinderTemplatePublishEvent finderTemplatePublishEvent = new com.tencent.mm.autogen.events.FinderTemplatePublishEvent();
        am.ld ldVar = finderTemplatePublishEvent.f54332g;
        ldVar.f7241a = string3;
        ldVar.f7242b = 2;
        finderTemplatePublishEvent.e();
        return f0Var;
    }
}
