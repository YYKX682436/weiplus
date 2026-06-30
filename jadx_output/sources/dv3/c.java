package dv3;

/* loaded from: classes5.dex */
public abstract class c extends com.tencent.mm.view.recyclerview.WxRecyclerAdapter {
    public final java.util.ArrayList I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f243996J;
    public int K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(in5.s itemConvertFactory, java.util.ArrayList data) {
        super(itemConvertFactory, data, false);
        kotlin.jvm.internal.o.g(itemConvertFactory, "itemConvertFactory");
        kotlin.jvm.internal.o.g(data, "data");
        this.I = data;
        this.f243996J = "";
    }

    public static void F0(dv3.c cVar, java.util.List audios, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addAudioList");
        }
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        cVar.getClass();
        kotlin.jvm.internal.o.g(audios, "audios");
        java.util.ArrayList arrayList = cVar.I;
        int size = arrayList.size();
        arrayList.removeIf(dv3.a.f243994a);
        int size2 = arrayList.size();
        java.util.List J0 = cVar.J0(audios);
        com.tencent.mars.xlog.Log.i(cVar.N0(), "addAudioList " + J0.size());
        if (size == size2) {
            arrayList.addAll(J0);
            if (z17) {
                cVar.notifyItemRangeInserted(size, J0.size());
                return;
            }
            return;
        }
        arrayList.addAll(J0);
        if (z17) {
            cVar.notifyItemChanged(size2);
            cVar.notifyItemRangeInserted(size, J0.size() - 1);
        }
    }

    public static /* synthetic */ void H0(dv3.c cVar, java.util.List list, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addAudioToListTop");
        }
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        cVar.G0(list, z17);
    }

    public final void G0(java.util.List audios, boolean z17) {
        kotlin.jvm.internal.o.g(audios, "audios");
        if (audios.isEmpty()) {
            return;
        }
        com.tencent.mars.xlog.Log.i(N0(), "addAudioToListTop: " + audios.size());
        java.util.List J0 = J0(audios);
        this.I.addAll(0, J0);
        if (z17) {
            notifyItemRangeInserted(0, J0.size());
        }
    }

    public final void I0() {
        if (kotlin.jvm.internal.o.b(this.f243996J, "")) {
            return;
        }
        V0(this.f243996J, rv3.y.f400419a);
    }

    public abstract java.util.List J0(java.util.List list);

    public final int K0(java.lang.String musicKey) {
        kotlin.jvm.internal.o.g(musicKey, "musicKey");
        int i17 = 0;
        for (java.lang.Object obj : this.I) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            in5.c cVar = (in5.c) obj;
            if ((cVar instanceof rv3.h) && kotlin.jvm.internal.o.b(((rv3.h) cVar).f400395d.a(), musicKey)) {
                return i17;
            }
            i17 = i18;
        }
        return -1;
    }

    public final rv3.h L0() {
        java.lang.Object obj;
        java.util.Iterator it = this.I.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            in5.c cVar = (in5.c) obj;
            if ((cVar instanceof rv3.h) && ((rv3.h) cVar).f400395d.B) {
                break;
            }
        }
        if (obj instanceof rv3.h) {
            return (rv3.h) obj;
        }
        return null;
    }

    public final int M0(int i17) {
        if (i17 < 0) {
            return -1;
        }
        java.util.ArrayList arrayList = this.I;
        if (i17 >= arrayList.size()) {
            return -1;
        }
        return ((in5.c) arrayList.get(i17)).h();
    }

    public final java.lang.String N0() {
        return "MicroMsg.AbsMusicPickerDataItemAdapter[" + hashCode() + ']';
    }

    public final boolean O0() {
        java.util.ArrayList arrayList = this.I;
        if ((arrayList instanceof java.util.Collection) && arrayList.isEmpty()) {
            return false;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((in5.c) it.next()).h() == 2) {
                return true;
            }
        }
        return false;
    }

    public final void P0(int i17) {
        this.K += i17;
    }

    public final in5.c Q0(int i17) {
        com.tencent.mars.xlog.Log.i(N0(), "removeAudio: " + i17);
        if (i17 >= 0) {
            java.util.ArrayList arrayList = this.I;
            if (i17 < arrayList.size()) {
                in5.c cVar = (in5.c) arrayList.remove(i17);
                notifyItemRemoved(i17);
                return cVar;
            }
        }
        return null;
    }

    public final void R0(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        java.util.Iterator it = this.I.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            in5.c cVar = (in5.c) it.next();
            if ((cVar instanceof rv3.h) && kotlin.jvm.internal.o.b(((rv3.h) cVar).f400395d.a(), str)) {
                break;
            } else {
                i17++;
            }
        }
        Q0(i17);
    }

    public final void S0(java.lang.String value) {
        kotlin.jvm.internal.o.g(value, "value");
        N0();
        this.f243996J = value;
    }

    public final void T0(java.util.List audios) {
        kotlin.jvm.internal.o.g(audios, "audios");
        java.util.List J0 = J0(audios);
        java.util.ArrayList arrayList = this.I;
        arrayList.clear();
        arrayList.addAll(J0);
        notifyDataSetChanged();
    }

    public final void U0(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo info, boolean z17) {
        kotlin.jvm.internal.o.g(info, "info");
        int K0 = K0(info.a());
        N0();
        if (K0 >= 0) {
            java.lang.Object obj = this.I.get(K0);
            rv3.h hVar = obj instanceof rv3.h ? (rv3.h) obj : null;
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = hVar != null ? hVar.f400395d : null;
            if (audioCacheInfo != null) {
                audioCacheInfo.L = z17;
            }
            notifyItemChanged(K0, new jz5.l(rv3.f.f400390e, java.lang.Boolean.valueOf(z17)));
        }
    }

    public void V0(java.lang.String musicKey, rv3.v newStatus) {
        kotlin.jvm.internal.o.g(musicKey, "musicKey");
        kotlin.jvm.internal.o.g(newStatus, "newStatus");
        int K0 = K0(musicKey);
        N0();
        newStatus.toString();
        if (K0 >= 0) {
            java.lang.Object obj = this.I.get(K0);
            rv3.h hVar = obj instanceof rv3.h ? (rv3.h) obj : null;
            if (hVar != null) {
                hVar.f400396e = newStatus;
            }
            notifyItemChanged(K0, newStatus);
        }
    }
}
