package dv3;

/* loaded from: classes5.dex */
public final class f extends dv3.c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(in5.s itemConvertFactory, java.util.ArrayList data) {
        super(itemConvertFactory, data);
        kotlin.jvm.internal.o.g(itemConvertFactory, "itemConvertFactory");
        kotlin.jvm.internal.o.g(data, "data");
    }

    @Override // dv3.c
    public java.util.List J0(java.util.List audios) {
        java.lang.Integer f17;
        java.lang.Integer f18;
        kotlin.jvm.internal.o.g(audios, "audios");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 0;
        for (java.lang.Object obj : audios) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = (com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo) obj;
            if (audioCacheInfo.f155722s || (((f17 = audioCacheInfo.f()) != null && f17.intValue() == 1) || ((f18 = audioCacheInfo.f()) != null && f18.intValue() == 3))) {
                arrayList.add(new rv3.n(audioCacheInfo));
            } else {
                java.lang.Integer f19 = audioCacheInfo.f();
                if (f19 != null && f19.intValue() == 5) {
                    arrayList.add(new rv3.j());
                }
            }
            i17 = i18;
        }
        return arrayList;
    }

    @Override // dv3.c
    public void V0(java.lang.String musicKey, rv3.v newStatus) {
        kotlin.jvm.internal.o.g(musicKey, "musicKey");
        kotlin.jvm.internal.o.g(newStatus, "newStatus");
        int K0 = K0(musicKey);
        newStatus.toString();
        if (K0 >= 0) {
            java.lang.Object obj = this.I.get(K0);
            rv3.n nVar = obj instanceof rv3.n ? (rv3.n) obj : null;
            if (kotlin.jvm.internal.o.b(newStatus, rv3.w.f400417a) ? true : kotlin.jvm.internal.o.b(newStatus, rv3.x.f400418a)) {
                if (nVar != null) {
                    nVar.f400403i = new cw3.f(null, 1, null);
                }
            } else if (kotlin.jvm.internal.o.b(newStatus, rv3.y.f400419a)) {
                if (nVar != null) {
                    nVar.f400403i = new cw3.h(null, 1, null);
                }
            } else if ((newStatus instanceof rv3.u) && nVar != null) {
                cw3.i iVar = ((rv3.u) newStatus).f400416a;
                kotlin.jvm.internal.o.g(iVar, "<set-?>");
                nVar.f400403i = iVar;
            }
            if (nVar != null) {
                nVar.f400396e = newStatus;
            }
            notifyItemChanged(K0, newStatus);
        }
    }
}
