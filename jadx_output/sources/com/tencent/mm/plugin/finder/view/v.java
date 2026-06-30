package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class v implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.w f133223a;

    public v(com.tencent.mm.plugin.finder.view.w wVar) {
        this.f133223a = wVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        int i17;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.plugin.finder.view.w wVar = this.f133223a;
        if (wVar.f133275i) {
            java.lang.String tag = wVar.getTag();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[checkFeedValid] errType=");
            sb6.append(fVar.f70615a);
            sb6.append(" errCode=");
            sb6.append(fVar.f70616b);
            sb6.append(" requestId=");
            com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = wVar.f133272f;
            sb6.append(finderObject2.getId());
            sb6.append(" mResetBusiBufListener:");
            sb6.append(wVar.f133274h);
            sb6.append(' ');
            com.tencent.mars.xlog.Log.i(tag, sb6.toString());
            if ((fVar.f70615a == 0 && fVar.f70616b == 0) || (i17 = fVar.f70616b) == -4012) {
                com.tencent.mm.plugin.finder.view.w.f133270o.put(java.lang.Long.valueOf(finderObject2.getId()), java.lang.Boolean.TRUE);
                kotlin.jvm.internal.o.g(finderObject2, "finderObject");
                int e17 = c01.id.e();
                pj4.t tVar = wVar.f133273g;
                boolean z17 = e17 >= tVar.f355291g + finderObject2.getUrlValidDuration();
                com.tencent.mars.xlog.Log.i(wVar.getTag(), "[isReplaceFinderObject] result=" + z17 + " feedId=" + pm0.v.u(finderObject2.getId()) + " statusCreateTime=" + tVar.f355291g + " urlValidDuration=" + finderObject2.getUrlValidDuration() + " current=" + c01.id.e());
                if ((z17 || wVar.f133274h != null) && (finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) fVar.f70618d).getCustom(2)) != null) {
                    finderObject2.parseFrom(finderObject.toByteArray());
                    pm0.v.X(new com.tencent.mm.plugin.finder.view.u(wVar));
                }
            } else if (i17 == -4011 || i17 == -4033 || i17 == -4036) {
                com.tencent.mm.plugin.finder.view.w.f133270o.put(java.lang.Long.valueOf(finderObject2.getId()), java.lang.Boolean.FALSE);
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_TEXT_STATUS_FEED_INVALID_WORDING_STRING, fVar.f70617c);
            }
            wVar.n(wVar.o());
            wVar.f133275i = false;
        } else {
            com.tencent.mars.xlog.Log.i(wVar.getTag(), "[checkFeedValid]: skip");
        }
        return jz5.f0.f302826a;
    }
}
