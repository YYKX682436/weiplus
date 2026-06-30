package hv3;

/* loaded from: classes5.dex */
public final class a extends dv3.c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(in5.s itemConvertFactory, java.util.ArrayList data) {
        super(itemConvertFactory, data);
        kotlin.jvm.internal.o.g(itemConvertFactory, "itemConvertFactory");
        kotlin.jvm.internal.o.g(data, "data");
    }

    @Override // dv3.c
    public java.util.List J0(java.util.List audios) {
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
            audioCacheInfo.f();
            java.lang.Integer f17 = audioCacheInfo.f();
            boolean z17 = true;
            if ((f17 != null && f17.intValue() == 4) || (f17 != null && f17.intValue() == 5)) {
                arrayList.add(new rv3.j());
            } else {
                if ((f17 == null || f17.intValue() != 1) && (f17 == null || f17.intValue() != 3)) {
                    z17 = false;
                }
                if (z17) {
                    arrayList.add(new rv3.h(audioCacheInfo));
                }
            }
            i17 = i18;
        }
        return arrayList;
    }
}
