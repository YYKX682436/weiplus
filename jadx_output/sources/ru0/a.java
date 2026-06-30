package ru0;

/* loaded from: classes5.dex */
public abstract class a {
    public static final java.util.List a(org.json.JSONObject jSONObject, boolean z17) {
        org.json.JSONArray optJSONArray;
        long j17;
        long j18;
        kotlin.jvm.internal.o.g(jSONObject, "<this>");
        java.lang.String optString = jSONObject.optString(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT);
        int i17 = 0;
        boolean z18 = optString == null || optString.length() == 0;
        kz5.p0 p0Var = kz5.p0.f313996d;
        if (z18 || (optJSONArray = jSONObject.optJSONArray("words_info")) == null) {
            return p0Var;
        }
        java.util.List a17 = ru0.t.a(optJSONArray, "word", "begin_time", "end_time", z17);
        if (((java.util.ArrayList) a17).isEmpty()) {
            return p0Var;
        }
        java.lang.String optString2 = jSONObject.optString("lang");
        kotlin.jvm.internal.o.d(optString);
        java.lang.String e17 = ru0.t.e(optString, "");
        kotlin.jvm.internal.o.d(optString2);
        if (e17.length() <= ru0.t.c(optString2)) {
            r45.le4 le4Var = new r45.le4();
            le4Var.f379379f = e17;
            le4Var.f379380g = optString2;
            le4Var.f379377d = ((ru0.n) kz5.n0.X(a17)).f399691b;
            le4Var.f379378e = ((ru0.n) kz5.n0.i0(a17)).f399692c - ((ru0.n) kz5.n0.X(a17)).f399691b;
            return kz5.b0.c(le4Var);
        }
        java.lang.String optString3 = jSONObject.optString("lang");
        kotlin.jvm.internal.o.f(optString3, "optString(...)");
        java.util.List b17 = ru0.t.b(a17, optString3, e17.length());
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(b17, 10));
        for (java.lang.Object obj : b17) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            ru0.f fVar = (ru0.f) obj;
            ru0.f fVar2 = (ru0.f) kz5.n0.a0(b17, i18);
            ru0.f fVar3 = (ru0.f) kz5.n0.a0(b17, i17 - 1);
            if (fVar2 == null) {
                j17 = fVar.f399669c;
            } else {
                long j19 = fVar.f399669c;
                long j27 = (fVar2.f399668b - j19) / 2;
                if (j27 > 100) {
                    j27 = 100;
                }
                j17 = j19 + j27;
            }
            if (fVar3 == null) {
                j18 = fVar.f399668b - 100;
                if (j18 < 0) {
                    j18 = 0;
                }
            } else {
                long j28 = fVar.f399668b;
                long j29 = (fVar3.f399669c - j28) / 2;
                j18 = j28 - (j29 <= 100 ? j29 : 100L);
            }
            r45.le4 le4Var2 = new r45.le4();
            le4Var2.f379379f = fVar.f399667a;
            le4Var2.f379377d = j18;
            le4Var2.f379378e = j17 - j18;
            arrayList.add(le4Var2);
            i17 = i18;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final java.lang.String b(com.tencent.maas.moviecomposing.segments.Segment segment) {
        com.tencent.maas.moviecomposing.segments.NarrationSegment narrationSegment;
        com.tencent.maas.moviecomposing.Timeline D;
        kotlin.jvm.internal.o.g(segment, "<this>");
        if (segment instanceof ug.n) {
            return ((ug.n) segment).c();
        }
        if (!(segment instanceof com.tencent.maas.moviecomposing.segments.NarrationSegment) || (D = (narrationSegment = (com.tencent.maas.moviecomposing.segments.NarrationSegment) segment).D()) == null) {
            return null;
        }
        return com.tencent.maas.moviecomposing.segments.NarrationSegment.N1(narrationSegment, D);
    }

    public static java.nio.ByteBuffer c(byte[] bArr, java.lang.Integer num, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            num = null;
        }
        kotlin.jvm.internal.o.g(bArr, "<this>");
        int intValue = num != null ? num.intValue() : com.tencent.mm.modelvoice.MediaRecorder.SilkGetEncSampleRate(new byte[]{bArr[0]}, 0L);
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            try {
                long SilkDecInit = com.tencent.mm.modelvoice.MediaRecorder.SilkDecInit(intValue, bArr, bArr.length, 0L);
                byte[] bArr2 = new byte[android.media.AudioTrack.getMinBufferSize(intValue, 4, 2) * 2];
                short s17 = (short) ((intValue * 20) / 1000);
                int i18 = 1;
                while (i18 > 0) {
                    i18 = com.tencent.mm.modelvoice.MediaRecorder.SilkDoDec(bArr2, s17, SilkDecInit);
                    if (i18 == 0 || i18 == 1) {
                        byteArrayOutputStream.write(bArr2, 0, s17 * 2);
                    }
                }
                com.tencent.mars.xlog.Log.i("Audio_Ext", "silk2pcmBuffer res " + com.tencent.mm.modelvoice.MediaRecorder.SilkDecUnInit(SilkDecInit));
                java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(byteArrayOutputStream.toByteArray());
                vz5.b.a(byteArrayOutputStream, null);
                return wrap;
            } finally {
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("Audio_Ext", "silk2wavFile", e17);
            return null;
        }
    }

    public static final java.nio.ByteBuffer d(com.tencent.mm.vfs.r6 r6Var) {
        kotlin.jvm.internal.o.g(r6Var, "<this>");
        java.io.InputStream C = com.tencent.mm.vfs.w6.C(r6Var);
        kotlin.jvm.internal.o.f(C, "openRead(...)");
        byte[] c17 = vz5.a.c(C instanceof java.io.BufferedInputStream ? (java.io.BufferedInputStream) C : new java.io.BufferedInputStream(C, 8192));
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(c17.length);
        allocateDirect.put(c17);
        return allocateDirect;
    }

    public static final void e(java.nio.ByteBuffer byteBuffer, java.lang.String filePath) {
        kotlin.jvm.internal.o.g(byteBuffer, "<this>");
        kotlin.jvm.internal.o.g(filePath, "filePath");
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(filePath));
        if (r6Var.m()) {
            r6Var.l();
        }
        r6Var.k();
        int capacity = byteBuffer.capacity();
        byte[] bArr = new byte[capacity];
        byteBuffer.rewind();
        byteBuffer.get(bArr);
        com.tencent.mm.vfs.w6.S(filePath, bArr, 0, capacity);
    }

    public static final yu0.t f(com.tencent.maas.moviecomposing.segments.Segment segment, com.tencent.maas.material.MJMaterialInfo info) {
        dw0.a aVar;
        kotlin.jvm.internal.o.g(segment, "<this>");
        kotlin.jvm.internal.o.g(info, "info");
        java.lang.String a17 = dw0.f.a(info);
        java.lang.String str = info.f48226d;
        kotlin.jvm.internal.o.f(str, "getMaterialName(...)");
        if (dw0.f.b(info)) {
            aVar = dw0.a.f244079f;
        } else {
            java.lang.String str2 = info.f48224b;
            kotlin.jvm.internal.o.f(str2, "getMaterialID(...)");
            dw0.a aVar2 = dw0.a.f244078e;
            aVar = r26.i0.y(str2, "publisher_speech_enhance_", false) ? dw0.a.f244080g : dw0.a.f244078e;
        }
        return g(segment, a17, str, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final yu0.t g(com.tencent.maas.moviecomposing.segments.Segment segment, java.lang.String assignRoleID, java.lang.String assignRoleName, dw0.a materialPrefix) {
        kotlin.jvm.internal.o.g(segment, "<this>");
        kotlin.jvm.internal.o.g(assignRoleID, "assignRoleID");
        kotlin.jvm.internal.o.g(assignRoleName, "assignRoleName");
        kotlin.jvm.internal.o.g(materialPrefix, "materialPrefix");
        if (segment instanceof ug.n) {
            com.tencent.maas.base.MJID mjid = segment.f48532a;
            kotlin.jvm.internal.o.f(mjid, "getSegmentID(...)");
            ug.n nVar = (ug.n) segment;
            java.lang.String e17 = nVar.e();
            kotlin.jvm.internal.o.f(e17, "getAudioFilePath(...)");
            java.util.ArrayList d17 = kz5.c0.d(new com.tencent.maas.moviecomposing.segments.CaptionItem(nVar.b(), new com.tencent.maas.model.time.MJTimeRange(com.tencent.maas.model.time.MJTime.ZeroTime, segment.z())));
            com.tencent.maas.model.time.MJTime z17 = segment.z();
            kotlin.jvm.internal.o.f(z17, "getPresentationDuration(...)");
            return new yu0.t(mjid, assignRoleID, assignRoleName, e17, d17, z17, materialPrefix);
        }
        if (!(segment instanceof com.tencent.maas.moviecomposing.segments.NarrationSegment)) {
            return null;
        }
        com.tencent.maas.moviecomposing.segments.NarrationSegment narrationSegment = (com.tencent.maas.moviecomposing.segments.NarrationSegment) segment;
        com.tencent.maas.base.MJID mjid2 = narrationSegment.f48532a;
        kotlin.jvm.internal.o.f(mjid2, "getSegmentID(...)");
        java.lang.String Q1 = narrationSegment.Q1();
        kotlin.jvm.internal.o.f(Q1, "getOriginNarrationFilePath(...)");
        com.tencent.maas.moviecomposing.segments.CaptionItem[] P1 = narrationSegment.P1();
        kotlin.jvm.internal.o.f(P1, "getCaptionItems(...)");
        java.util.List z07 = kz5.z.z0(P1);
        com.tencent.maas.model.time.MJTime p07 = narrationSegment.p0();
        kotlin.jvm.internal.o.f(p07, "getTotalDurationIncludingExpandable(...)");
        return new yu0.t(mjid2, assignRoleID, assignRoleName, Q1, z07, p07, materialPrefix);
    }
}
