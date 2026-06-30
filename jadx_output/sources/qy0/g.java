package qy0;

/* loaded from: classes5.dex */
public final /* synthetic */ class g extends kotlin.jvm.internal.m implements yz5.l {
    public g(java.lang.Object obj) {
        super(1, obj, com.tencent.mm.mj_template.album_template.multi_template.MMMusicManager.class, "selectMusic", "selectMusic(Ljava/lang/Object;)V", 0);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object p07) {
        jz5.f0 f0Var;
        jz5.f0 f0Var2;
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(p07, "p0");
        com.tencent.mm.mj_template.album_template.multi_template.MMMusicManager mMMusicManager = (com.tencent.mm.mj_template.album_template.multi_template.MMMusicManager) this.receiver;
        mMMusicManager.getClass();
        com.tencent.mm.mj_template.sns.compose.widget.e1 e1Var = p07 instanceof com.tencent.mm.mj_template.sns.compose.widget.e1 ? (com.tencent.mm.mj_template.sns.compose.widget.e1) p07 : null;
        jz5.f0 f0Var3 = jz5.f0.f302826a;
        if (e1Var != null) {
            n0.q4 q4Var = (n0.q4) mMMusicManager.f69745g;
            java.lang.String musicID = ((com.tencent.maas.model.MJMusicInfo) q4Var.getValue()).getMusicID();
            r45.k96 k96Var = (r45.k96) e1Var.f69938a;
            if (kotlin.jvm.internal.o.b(musicID, k96Var.f378517d)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MMMusicManager", "selectMusic: current play music is " + k96Var.f378517d + ", no need to switch");
                f0Var = f0Var3;
            } else {
                n0.q4 q4Var2 = (n0.q4) mMMusicManager.f69744f;
                java.util.Iterator it = ((java.lang.Iterable) q4Var2.getValue()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (kotlin.jvm.internal.o.b(((com.tencent.maas.model.MJMusicInfo) obj).getMusicID(), k96Var.f378517d)) {
                        break;
                    }
                }
                if (obj != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MMMusicManager", "selectMusic: contains " + k96Var.f378517d);
                    f0Var = f0Var3;
                } else {
                    java.util.List list = mMMusicManager.f69747i;
                    java.util.ArrayList arrayList = (java.util.ArrayList) list;
                    java.util.Iterator it6 = arrayList.iterator();
                    int i17 = 0;
                    while (true) {
                        if (!it6.hasNext()) {
                            i17 = -1;
                            break;
                        }
                        if (kotlin.jvm.internal.o.b(java.lang.String.valueOf(((r45.mh4) it6.next()).f380508d), ((com.tencent.maas.model.MJMusicInfo) q4Var.getValue()).getMusicID())) {
                            break;
                        }
                        i17++;
                    }
                    int i18 = i17 + 1;
                    r45.mh4 mh4Var = new r45.mh4();
                    java.lang.String music_id = k96Var.f378517d;
                    kotlin.jvm.internal.o.f(music_id, "music_id");
                    java.lang.Integer h17 = r26.h0.h(music_id);
                    mh4Var.f380508d = h17 != null ? h17.intValue() : 0;
                    mh4Var.f380513i = k96Var.f378520g;
                    mh4Var.f380514m.add(k96Var.f378521h);
                    mh4Var.f380511g = k96Var.f378518e;
                    java.util.LinkedList linkedList = mh4Var.f380515n;
                    java.util.LinkedList lyrics = k96Var.f378522i;
                    kotlin.jvm.internal.o.f(lyrics, "lyrics");
                    f0Var = f0Var3;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(lyrics, 10));
                    for (java.util.Iterator it7 = lyrics.iterator(); it7.hasNext(); it7 = it7) {
                        r45.l96 l96Var = (r45.l96) it7.next();
                        r45.nh4 nh4Var = new r45.nh4();
                        nh4Var.f381400e = l96Var.f379258e;
                        nh4Var.f381399d = l96Var.f379257d;
                        arrayList2.add(nh4Var);
                    }
                    linkedList.addAll(arrayList2);
                    arrayList.add(i18, mh4Var);
                    java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(list, 10));
                    java.util.Iterator it8 = ((java.util.ArrayList) list).iterator();
                    while (it8.hasNext()) {
                        r45.mh4 mh4Var2 = (r45.mh4) it8.next();
                        java.lang.String valueOf = java.lang.String.valueOf(mh4Var2.f380508d);
                        java.lang.String str = mh4Var2.f380513i;
                        java.util.LinkedList singer_name = mh4Var2.f380514m;
                        kotlin.jvm.internal.o.f(singer_name, "singer_name");
                        java.lang.String g07 = kz5.n0.g0(singer_name, null, null, null, 0, null, null, 63, null);
                        com.tencent.maas.model.time.MJTime mJTime = new com.tencent.maas.model.time.MJTime();
                        java.util.LinkedList lyrics2 = mh4Var2.f380515n;
                        kotlin.jvm.internal.o.f(lyrics2, "lyrics");
                        java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(lyrics2, 10));
                        java.util.Iterator it9 = lyrics2.iterator();
                        while (it9.hasNext()) {
                            arrayList4.add(new com.tencent.maas.model.MJLyricInfo(null, null, ((r45.nh4) it9.next()).f381400e, null));
                        }
                        arrayList3.add(new com.tencent.maas.model.MJMusicInfo(valueOf, str, g07, mJTime, arrayList4.toArray(new com.tencent.maas.model.MJLyricInfo[0])));
                    }
                    q4Var2.setValue(arrayList3);
                    java.util.Map map = mMMusicManager.f69752q.f422801k;
                    java.lang.String music_id2 = k96Var.f378517d;
                    kotlin.jvm.internal.o.f(music_id2, "music_id");
                    map.put(music_id2, java.lang.Long.valueOf(e1Var.f69939b));
                }
                java.lang.String music_id3 = k96Var.f378517d;
                kotlin.jvm.internal.o.f(music_id3, "music_id");
                mMMusicManager.a(music_id3);
            }
            f0Var2 = f0Var;
        } else {
            f0Var = f0Var3;
            f0Var2 = null;
        }
        if (f0Var2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMMusicManager", "selectMusic: obj is not valued type");
        }
        return f0Var;
    }
}
