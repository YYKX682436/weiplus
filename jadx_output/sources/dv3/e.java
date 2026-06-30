package dv3;

/* loaded from: classes5.dex */
public final class e extends dv3.c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(in5.s itemConvertFactory, java.util.ArrayList data) {
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
                arrayList.add(new rv3.h(audioCacheInfo));
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
}
