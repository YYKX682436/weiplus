package wt3;

/* loaded from: classes5.dex */
public final class g {
    public g(kotlin.jvm.internal.i iVar) {
    }

    public final com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo a(r45.vv0 info, int i17, boolean z17) {
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo;
        int i18;
        int i19;
        long j17;
        ll3.h1 h1Var;
        long j18;
        kotlin.jvm.internal.o.g(info, "info");
        r45.ug4 ug4Var = info.f388599d;
        if (ug4Var != null) {
            audioCacheInfo = new com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo();
            r45.pg4 pg4Var = ug4Var.f387347d;
            java.lang.String str = pg4Var != null ? pg4Var.f383021g : null;
            if (str == null) {
                str = "";
            }
            if (!(str.length() == 0)) {
                audioCacheInfo.f155714h.add(str);
            }
            java.lang.String str2 = pg4Var != null ? pg4Var.f383018d : null;
            if (str2 == null || str2.length() == 0) {
                str2 = java.lang.String.valueOf(ug4Var.hashCode());
            }
            java.lang.String o17 = dw3.c0.f244182a.o(java.lang.String.valueOf(str2));
            audioCacheInfo.f155715i = o17;
            java.lang.String str3 = ug4Var.f387349f;
            if (str3 == null) {
                str3 = "";
            }
            audioCacheInfo.f155712f = str3;
            i95.m c17 = i95.n0.c(m40.k0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            audioCacheInfo.f155716m = ((c61.p7) ((m40.k0) c17)).ij(o17);
            audioCacheInfo.f155717n = false;
            java.lang.String str4 = pg4Var != null ? pg4Var.f383020f : null;
            if (str4 == null) {
                str4 = "";
            }
            audioCacheInfo.f155723t = str4;
            audioCacheInfo.f155718o = i17;
            long j19 = ug4Var.f387351h;
            audioCacheInfo.E = j19;
            long j27 = ug4Var.f387352i;
            audioCacheInfo.F = j27;
            audioCacheInfo.f155720q = (!z17 || j19 < 0 || j27 <= 0 || j27 <= j19) ? pg4Var != null ? pg4Var.f383023i : 0 : (int) (j27 - j19);
            audioCacheInfo.B = ug4Var.f387348e == 1;
            audioCacheInfo.A = pg4Var;
            java.lang.String str5 = pg4Var != null ? pg4Var.f383022h : null;
            if (str5 == null) {
                str5 = "";
            }
            audioCacheInfo.f155725v = str5;
            java.lang.String str6 = ug4Var.f387347d.f383019e == 4 ? "wxfinderobject_" + ug4Var.f387347d.f383024m : "Listen_" + ug4Var.f387347d.f383018d;
            kotlin.jvm.internal.o.g(str6, "<set-?>");
            audioCacheInfo.C = str6;
            int i27 = ug4Var.f387354n;
            java.lang.String str7 = pg4Var != null ? pg4Var.f383018d : null;
            if (str7 == null) {
                str7 = "";
            }
            audioCacheInfo.f155711e = i27 != 0 ? i27 : str7.length() == 0 ? ug4Var.hashCode() : str7.hashCode();
            audioCacheInfo.D = ug4Var.f387362v;
            r45.mh4 mh4Var = audioCacheInfo.f155710d;
            mh4Var.f380523v = ug4Var.f387361u;
            mh4Var.f380508d = ug4Var.f387354n;
            mh4Var.f380524w = pm0.v.Z(str7);
            mh4Var.f380516o = audioCacheInfo.f155725v;
            mh4Var.f380511g = audioCacheInfo.f155712f;
            mh4Var.f380514m = new java.util.LinkedList(audioCacheInfo.f155714h);
            mh4Var.f380513i = audioCacheInfo.f155723t;
            java.lang.String str8 = ug4Var.f387353m;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            ((ja0.m0) ((ka0.q0) i95.n0.c(ka0.q0.class))).getClass();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            ll3.h1 f17 = ll3.h1.f(str8, "", "", true, "", false, false);
            if (f17.e() > 0) {
                int e17 = f17.e();
                for (int i28 = 0; i28 < e17; i28 = i19) {
                    ll3.f1 d17 = f17.d(i28);
                    int i29 = i28 + 1;
                    ll3.f1 d18 = f17.d(i29);
                    if (d17 != null) {
                        i18 = e17;
                        i19 = i29;
                        j17 = d17.f319167a;
                    } else {
                        i18 = e17;
                        i19 = i29;
                        j17 = 0;
                    }
                    java.lang.String str9 = d17 != null ? d17.f319168b : null;
                    java.lang.String str10 = str9 == null ? "" : str9;
                    if (d18 != null) {
                        h1Var = f17;
                        j18 = d18.f319167a;
                    } else {
                        h1Var = f17;
                        j18 = j17;
                    }
                    arrayList2.add(new ll3.s1(str10, j17, j18));
                    f17 = h1Var;
                    e17 = i18;
                }
            }
            java.util.Iterator it = arrayList2.iterator();
            int i37 = 0;
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                int i38 = i37 + 1;
                if (i37 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                ll3.s1 s1Var = (ll3.s1) next;
                arrayList.add(new wt3.h(s1Var.f319234a, (int) s1Var.f319235b, (int) s1Var.f319236c));
                i37 = i38;
            }
            if (com.tencent.mm.sdk.platformtools.t8.L0(arrayList)) {
                java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.h4i);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                arrayList.add(new wt3.h(string, 0, 0));
            }
            audioCacheInfo.f155713g = arrayList;
            audioCacheInfo.f155721r = !com.tencent.mm.sdk.platformtools.t8.K0(ug4Var.f387353m);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("createFromListenBgmItem: ");
            sb6.append(str4);
            sb6.append(" cached:");
            sb6.append(audioCacheInfo.f155716m);
            sb6.append(" musicType:");
            sb6.append(ug4Var.f387361u);
            sb6.append(" listenType:");
            r45.pg4 pg4Var2 = ug4Var.f387347d;
            sb6.append(pg4Var2 != null ? java.lang.Integer.valueOf(pg4Var2.f383019e) : null);
            sb6.append(" musicSid:");
            sb6.append(i27);
            sb6.append(" listenId:");
            sb6.append(str7);
            sb6.append(" mjMusicId:");
            sb6.append(audioCacheInfo.C);
            sb6.append(" cachePathHash:");
            sb6.append(o17.hashCode());
            sb6.append(" isNewPublisher:");
            sb6.append(z17);
            sb6.append(" duration:");
            sb6.append(pg4Var != null ? java.lang.Integer.valueOf(pg4Var.f383023i) : null);
            sb6.append(" mir_begin:");
            sb6.append(ug4Var.f387351h);
            sb6.append(" mir_end:");
            sb6.append(ug4Var.f387352i);
            com.tencent.mars.xlog.Log.i("MicroMsg.AudioCacheInfo", sb6.toString());
        } else {
            audioCacheInfo = new com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo();
        }
        audioCacheInfo.I = info.f388600e;
        audioCacheInfo.f155728y = info.f388601f;
        audioCacheInfo.L = info.f388602g;
        audioCacheInfo.K = info.f388603h;
        return audioCacheInfo;
    }

    public final com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo b(com.tencent.maas.model.MJMusicInfo info, int i17) {
        kotlin.jvm.internal.o.g(info, "info");
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = new com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo();
        audioCacheInfo.f155718o = i17;
        java.lang.String musicID = info.getMusicID();
        kotlin.jvm.internal.o.f(musicID, "getMusicID(...)");
        audioCacheInfo.C = musicID;
        java.lang.String songName = info.getSongName();
        kotlin.jvm.internal.o.f(songName, "getSongName(...)");
        audioCacheInfo.f155723t = songName;
        audioCacheInfo.f155714h.add(info.getSingerNames());
        audioCacheInfo.f155711e = info.getMusicID().hashCode();
        java.lang.String coverImageURL = info.getCoverImageURL();
        if (coverImageURL == null) {
            coverImageURL = "";
        }
        audioCacheInfo.f155725v = coverImageURL;
        audioCacheInfo.f155720q = (int) info.getDuration().toMilliseconds();
        audioCacheInfo.f155712f = "";
        audioCacheInfo.f155717n = false;
        audioCacheInfo.f155716m = false;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.maas.model.MJLyricInfo[] lyricObjs = info.getLyricObjs();
        if (lyricObjs != null) {
            for (com.tencent.maas.model.MJLyricInfo mJLyricInfo : lyricObjs) {
                if (mJLyricInfo != null) {
                    int milliseconds = (int) mJLyricInfo.getStartTime().toMilliseconds();
                    java.lang.String content = mJLyricInfo.getContent();
                    kotlin.jvm.internal.o.f(content, "getContent(...)");
                    wt3.h hVar = new wt3.h(content, milliseconds, milliseconds);
                    if (!com.tencent.mm.sdk.platformtools.t8.L0(arrayList)) {
                        ((wt3.h) arrayList.get(arrayList.size() - 1)).f449423c = milliseconds;
                    }
                    arrayList.add(hVar);
                }
            }
        }
        audioCacheInfo.f155713g = arrayList;
        audioCacheInfo.f155721r = !arrayList.isEmpty();
        r45.mh4 mh4Var = audioCacheInfo.f155710d;
        mh4Var.f380523v = 0;
        mh4Var.f380524w = com.tencent.mm.sdk.platformtools.t8.E1(info.getMusicID());
        mh4Var.f380516o = audioCacheInfo.f155725v;
        mh4Var.f380511g = audioCacheInfo.f155712f;
        mh4Var.f380514m = new java.util.LinkedList(audioCacheInfo.f155714h);
        mh4Var.f380513i = audioCacheInfo.f155723t;
        com.tencent.mars.xlog.Log.i("MicroMsg.AudioCacheInfo", "createFromMJMusicInfo: musicId=" + audioCacheInfo.f155711e + ", name=" + audioCacheInfo.f155723t + ", mjMusicId=" + audioCacheInfo.C + ", lyricsList=" + audioCacheInfo.f155713g + ',');
        return audioCacheInfo;
    }

    public final com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo c(r45.mh4 info, int i17) {
        kotlin.jvm.internal.o.g(info, "info");
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = new com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo();
        audioCacheInfo.f155710d = info;
        audioCacheInfo.f155711e = info.f380508d;
        audioCacheInfo.f155712f = info.f380511g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.LinkedList lyrics = info.f380515n;
        kotlin.jvm.internal.o.f(lyrics, "lyrics");
        java.util.Iterator it = lyrics.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            r45.nh4 nh4Var = (r45.nh4) it.next();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(nh4Var.f381400e)) {
                java.lang.String lyrics_content = nh4Var.f381400e;
                kotlin.jvm.internal.o.f(lyrics_content, "lyrics_content");
                int i18 = nh4Var.f381399d;
                wt3.h hVar = new wt3.h(lyrics_content, i18, i18);
                if (!com.tencent.mm.sdk.platformtools.t8.L0(arrayList)) {
                    ((wt3.h) arrayList.get(arrayList.size() - 1)).f449423c = nh4Var.f381399d;
                }
                arrayList.add(hVar);
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.L0(arrayList)) {
            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.h4i);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            arrayList.add(new wt3.h(string, 0, 0));
        }
        audioCacheInfo.f155714h.addAll(info.f380514m);
        audioCacheInfo.f155713g = arrayList;
        dw3.c0 c0Var = dw3.c0.f244182a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(info.f380508d);
        sb6.append('_');
        sb6.append(c01.id.c());
        java.lang.String o17 = c0Var.o(sb6.toString());
        audioCacheInfo.f155715i = o17;
        audioCacheInfo.f155716m = com.tencent.mm.vfs.w6.k(o17) > 0;
        audioCacheInfo.f155717n = false;
        java.lang.String song_name = info.f380513i;
        kotlin.jvm.internal.o.f(song_name, "song_name");
        audioCacheInfo.f155723t = song_name;
        audioCacheInfo.f155718o = i17;
        audioCacheInfo.f155720q = info.f380520s;
        audioCacheInfo.f155721r = info.f380521t == 1;
        java.lang.String str = info.C;
        if (str == null) {
            str = "";
        }
        audioCacheInfo.C = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.AudioCacheInfo", "createFromMusicInfo: musicId=" + audioCacheInfo.f155711e + ", name=" + audioCacheInfo.f155723t + ", lyricsList=" + audioCacheInfo.f155713g + ", mjMusicId=" + audioCacheInfo.C);
        return audioCacheInfo;
    }
}
