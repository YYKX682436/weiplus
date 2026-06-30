package ey2;

/* loaded from: classes8.dex */
public final class j extends pf5.o0 implements xy2.e {

    /* renamed from: e, reason: collision with root package name */
    public r45.j13 f257400e;

    public final java.lang.String N6(java.util.List list) {
        java.util.Iterator it = list.iterator();
        java.lang.String str = "";
        while (it.hasNext()) {
            str = str + ((java.lang.String) it.next()) + com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE;
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String O6(com.tencent.mm.protocal.protobuf.FinderObject r5) {
        /*
            r4 = this;
            java.lang.String r0 = "finderObj"
            kotlin.jvm.internal.o.g(r5, r0)
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r5.getObjectDesc()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1c
            r45.ik2 r0 = r0.getFinder_newlife_desc()
            if (r0 == 0) goto L1c
            r3 = 3
            int r0 = r0.getInteger(r3)
            if (r0 != r1) goto L1c
            r0 = r1
            goto L1d
        L1c:
            r0 = r2
        L1d:
            if (r0 != 0) goto L3b
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r5.getObjectDesc()
            if (r0 == 0) goto L35
            r45.ik2 r0 = r0.getFinder_newlife_desc()
            if (r0 == 0) goto L35
            r3 = 11
            int r0 = r0.getInteger(r3)
            if (r0 != r1) goto L35
            r0 = r1
            goto L36
        L35:
            r0 = r2
        L36:
            if (r0 == 0) goto L39
            goto L3b
        L39:
            r0 = r2
            goto L3c
        L3b:
            r0 = r1
        L3c:
            if (r0 == 0) goto L45
            xy2.d r5 = xy2.d.f458157d
            java.lang.String r5 = r4.P6(r5)
            goto L72
        L45:
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r5.getObjectDesc()
            if (r0 == 0) goto L54
            int r0 = r0.getMediaType()
            r3 = 4
            if (r0 != r3) goto L54
            r0 = r1
            goto L55
        L54:
            r0 = r2
        L55:
            if (r0 != 0) goto L6c
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r5 = r5.getObjectDesc()
            if (r5 == 0) goto L65
            int r5 = r5.getMediaType()
            r0 = 2
            if (r5 != r0) goto L65
            goto L66
        L65:
            r1 = r2
        L66:
            if (r1 == 0) goto L69
            goto L6c
        L69:
            java.lang.String r5 = ""
            goto L72
        L6c:
            xy2.d r5 = xy2.d.f458158e
            java.lang.String r5 = r4.P6(r5)
        L72:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[getHeader] return:"
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Finder.FinderCdnUploadCustomHeaderVM"
            com.tencent.mars.xlog.Log.i(r1, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ey2.j.O6(com.tencent.mm.protocal.protobuf.FinderObject):java.lang.String");
    }

    public java.lang.String P6(xy2.d type) {
        kotlin.jvm.internal.o.g(type, "type");
        java.lang.String str = "";
        if (this.f257400e == null) {
            com.tencent.mars.xlog.Log.i("Finder.FinderCdnUploadCustomHeaderVM", "[getConfig] parse from storage");
            try {
                r45.j13 j13Var = new r45.j13();
                java.lang.String v17 = gm0.j1.u().c().v(com.tencent.mm.storage.u3.USERINFO_FINDER_CDN_UPLOAD_TEMPURL_CONFIG_STRING_SYNC, "");
                kotlin.jvm.internal.o.d(v17);
                if (v17.length() > 0) {
                    j13Var.parseFrom(com.tencent.mm.sdk.platformtools.t8.h(v17));
                    this.f257400e = j13Var;
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("Finder.FinderCdnUploadCustomHeaderVM", th6, "[getConfig] parse config fail", new java.lang.Object[0]);
            }
        }
        r45.j13 j13Var2 = this.f257400e;
        if (j13Var2 == null) {
            j13Var2 = new r45.j13();
        }
        if (type == xy2.d.f458157d && j13Var2.getInteger(0) == 1) {
            java.util.LinkedList list = j13Var2.getList(3);
            kotlin.jvm.internal.o.f(list, "getNewlife_param(...)");
            str = N6(list);
        } else if (type == xy2.d.f458158e && j13Var2.getInteger(1) == 1) {
            java.util.LinkedList list2 = j13Var2.getList(4);
            kotlin.jvm.internal.o.f(list2, "getFinder_param(...)");
            str = N6(list2);
        } else if (type == xy2.d.f458159f && j13Var2.getInteger(2) == 1) {
            java.util.LinkedList list3 = j13Var2.getList(5);
            kotlin.jvm.internal.o.f(list3, "getLive_param(...)");
            str = N6(list3);
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderCdnUploadCustomHeaderVM", "[getHeader] type:" + type + " return:" + str);
        return str;
    }

    public void Q6(r45.xb1 resp) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(resp, "resp");
        java.util.LinkedList list = resp.getList(30);
        kotlin.jvm.internal.o.f(list, "getFinder_config_item(...)");
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (kotlin.jvm.internal.o.b(((r45.yy0) obj).getString(0), "upload_get_temp_url")) {
                    break;
                }
            }
        }
        r45.yy0 yy0Var = (r45.yy0) obj;
        if (yy0Var != null) {
            r45.j13 j13Var = new r45.j13();
            com.tencent.mm.protobuf.g byteString = yy0Var.getByteString(1);
            if (byteString != null) {
                j13Var.parseFrom(byteString.g());
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[updateConfig] enable_newlife:");
            sb6.append(j13Var.getInteger(0));
            sb6.append(", enable_live:");
            sb6.append(j13Var.getInteger(2));
            sb6.append(", enable_finder:");
            sb6.append(j13Var.getInteger(1));
            sb6.append(" newlife_param:");
            java.util.LinkedList list2 = j13Var.getList(3);
            kotlin.jvm.internal.o.f(list2, "getNewlife_param(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list2, 10));
            java.util.Iterator it6 = list2.iterator();
            while (it6.hasNext()) {
                arrayList.add(((java.lang.String) it6.next()) + '\r');
            }
            sb6.append(arrayList);
            sb6.append("  finder_param:");
            java.util.LinkedList list3 = j13Var.getList(4);
            kotlin.jvm.internal.o.f(list3, "getFinder_param(...)");
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list3, 10));
            java.util.Iterator it7 = list3.iterator();
            while (it7.hasNext()) {
                arrayList2.add(((java.lang.String) it7.next()) + '\r');
            }
            sb6.append(arrayList2);
            sb6.append(" live_param:");
            java.util.LinkedList list4 = j13Var.getList(5);
            kotlin.jvm.internal.o.f(list4, "getLive_param(...)");
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(list4, 10));
            java.util.Iterator it8 = list4.iterator();
            while (it8.hasNext()) {
                arrayList3.add(((java.lang.String) it8.next()) + '\r');
            }
            sb6.append(arrayList3);
            com.tencent.mars.xlog.Log.i("Finder.FinderCdnUploadCustomHeaderVM", sb6.toString());
            this.f257400e = j13Var;
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_CDN_UPLOAD_TEMPURL_CONFIG_STRING_SYNC, com.tencent.mm.sdk.platformtools.t8.l(j13Var.toByteArray()));
        }
    }
}
