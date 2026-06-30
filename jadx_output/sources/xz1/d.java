package xz1;

/* loaded from: classes15.dex */
public final class d {
    public d(kotlin.jvm.internal.i iVar) {
    }

    public static final org.json.JSONObject a(xz1.d dVar, qk.u6 u6Var) {
        dVar.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE);
        jSONObject.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, u6Var.a());
        xz1.d dVar2 = xz1.k.f458187i;
        jSONObject.put(dm.i4.COL_ID, dVar2.d(u6Var));
        jSONObject.put("description", u6Var.description());
        jSONObject.put("webSocketDebuggerUrl", "ws://" + dVar2.d(u6Var));
        jSONObject.put("devtoolsFrontendUrl", "devtools://devtools/bundled/inspector.html?ws=localhost" + dVar2.d(u6Var));
        return jSONObject;
    }

    public static final yz1.h b(xz1.d dVar, yz1.h hVar, yz1.c cVar) {
        dVar.getClass();
        hVar.f468502a.clear();
        java.util.ArrayList arrayList = hVar.f468503b;
        arrayList.clear();
        hVar.f468504c = null;
        java.lang.String a17 = cVar.a();
        if (a17 == null) {
            throw new java.io.IOException("reader:" + cVar + " can not readLine");
        }
        java.lang.String[] strArr = (java.lang.String[]) new r26.t(" ").g(a17, 3).toArray(new java.lang.String[0]);
        if (strArr.length != 3) {
            throw new java.io.IOException("Invalid request line: ".concat(a17));
        }
        java.lang.String str = strArr[0];
        hVar.f468504c = android.net.Uri.parse(strArr[1]);
        java.lang.String str2 = strArr[2];
        while (true) {
            java.lang.String a18 = cVar.a();
            if (a18 == null) {
                throw new java.io.EOFException();
            }
            if (kotlin.jvm.internal.o.b("", a18)) {
                return hVar;
            }
            java.lang.String[] strArr2 = (java.lang.String[]) new r26.t(": ").g(a18, 2).toArray(new java.lang.String[0]);
            if (strArr2.length != 2) {
                throw new java.io.IOException("Malformed header: ".concat(a18));
            }
            java.lang.String str3 = strArr2[0];
            java.lang.String str4 = strArr2[1];
            hVar.f468502a.add(str3);
            arrayList.add(str4);
        }
    }

    public static final void c(xz1.d dVar, yz1.i iVar, yz1.d dVar2, java.io.OutputStream outputStream) {
        dVar.getClass();
        yz1.f fVar = iVar.f468507e;
        if (fVar != null) {
            iVar.a("Content-Type", ((yz1.e) fVar).f468500a);
            iVar.a("Content-Length", java.lang.String.valueOf(((yz1.e) iVar.f468507e).f468501b.length));
        }
        dVar.e(iVar, dVar2);
        yz1.f fVar2 = iVar.f468507e;
        if (fVar2 != null) {
            outputStream.write(((yz1.e) fVar2).f468501b);
        }
    }

    public final java.lang.String d(qk.u6 u6Var) {
        return "/page/" + u6Var.name();
    }

    public final void e(yz1.i response, yz1.d writer) {
        java.io.BufferedOutputStream bufferedOutputStream;
        kotlin.jvm.internal.o.g(response, "response");
        kotlin.jvm.internal.o.g(writer, "writer");
        java.lang.String str = "HTTP/1.1 " + response.f468505c + ' ' + response.f468506d;
        int length = str.length();
        int i17 = 0;
        while (true) {
            bufferedOutputStream = writer.f468499a;
            if (i17 >= length) {
                break;
            }
            bufferedOutputStream.write(str.charAt(i17));
            i17++;
        }
        bufferedOutputStream.write(yz1.d.f468498b);
        java.util.ArrayList arrayList = response.f468502a;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            java.lang.String str2 = ((java.lang.String) arrayList.get(i18)) + ": " + ((java.lang.String) response.f468503b.get(i18));
            int length2 = str2.length();
            for (int i19 = 0; i19 < length2; i19++) {
                bufferedOutputStream.write(str2.charAt(i19));
            }
            bufferedOutputStream.write(yz1.d.f468498b);
        }
        bufferedOutputStream.write(yz1.d.f468498b);
        bufferedOutputStream.flush();
    }
}
