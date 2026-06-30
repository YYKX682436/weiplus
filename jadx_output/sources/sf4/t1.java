package sf4;

/* loaded from: classes4.dex */
public final class t1 implements dn.k {
    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        boolean z18;
        boolean z19 = true;
        if (hVar != null && hVar.field_retCode == -21112) {
            com.tencent.mars.xlog.Log.i("MicroMsg.StoryVideoPreloadMgr", hashCode() + " onPreload, mediaId:" + str + ", video source change!");
            sf4.u1.a(sf4.u1.f407583a, str);
            return 0;
        }
        if (gVar != null && gVar.field_toltalLength > 0) {
            if4.h hVar2 = (if4.h) sf4.u1.f407588f.get(str);
            java.util.Set set = sf4.u1.f407590h;
            boolean O = kz5.n0.O(set, str);
            int i18 = (int) ((((float) gVar.field_finishedLength) / ((float) gVar.field_toltalLength)) * 100);
            java.lang.Integer num = (java.lang.Integer) sf4.u1.f407589g.get(str);
            int intValue = num != null ? num.intValue() : 0;
            java.lang.String str2 = hashCode() + " onPreload, mediaId:" + str + ", startRet:" + i17 + ", preloadOffset:" + gVar.field_finishedLength + ", totalLength: " + gVar.field_toltalLength + " desiredPreloadPercent:" + intValue + ", preloadPercent:" + i18 + " isFinish:" + O;
            if (intValue <= 0 || i18 < intValue) {
                z18 = false;
            } else {
                str2 = str2 + " exceed:true ";
                z18 = true;
            }
            if (hVar2 != null) {
                nf4.o b17 = ef4.k0.f252459a.b(hVar2);
                b17.field_cacheSize = (int) gVar.field_finishedLength;
                b17.field_totalSize = (int) gVar.field_toltalLength;
                ef4.v vVar = ef4.w.f252468t;
                vVar.k().D0(b17);
                nf4.f y07 = vVar.g().y0(hVar2.f291256d);
                long j17 = y07.field_syncId;
                long j18 = hVar2.f291254b;
                if (j17 == j18 && y07.isValid()) {
                    java.lang.String Id = hVar2.f291258f.f390021d;
                    kotlin.jvm.internal.o.f(Id, "Id");
                    int i19 = b17.field_cacheSize;
                    if (j18 == y07.field_syncId) {
                        y07.field_preloadStoryId = j18;
                        y07.field_preloadMediaId = Id;
                        y07.field_preLoadResource = i19;
                    } else {
                        z19 = false;
                    }
                    if (z19) {
                        str2 = str2 + " * ext pre update * ";
                        nf4.g g17 = vVar.g();
                        if (g17.d1((int) y07.systemRowid, y07) >= 0) {
                            g17.doNotify("notify_story_preload", 3, y07);
                        }
                    }
                }
                if (z18 && str != null) {
                    set.add(str);
                }
                str2 = str2 + "update cacheSize done";
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.StoryVideoPreloadMgr", str2 + ", currentSpeed:" + sf4.u1.f407583a.g());
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return new byte[0];
    }
}
