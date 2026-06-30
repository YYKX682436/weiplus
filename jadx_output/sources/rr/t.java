package rr;

/* loaded from: classes12.dex */
public abstract class t {
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b4, code lost:
    
        if (r5 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cf, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b6, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cc, code lost:
    
        if (r5 == null) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList a(com.tencent.mm.vfs.r6 r11) {
        /*
            java.lang.String r0 = ""
            java.lang.String r1 = "MicroMsg.EmojiResHelper"
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            javax.xml.parsers.DocumentBuilderFactory r3 = javax.xml.parsers.DocumentBuilderFactory.newInstance()
            r4 = 0
            r5 = 0
            java.io.InputStream r5 = com.tencent.mm.vfs.w6.C(r11)     // Catch: java.lang.Throwable -> Lba java.lang.Exception -> Lbc
            javax.xml.parsers.DocumentBuilder r11 = r3.newDocumentBuilder()     // Catch: java.lang.Throwable -> Lba java.lang.Exception -> Lbc
            org.w3c.dom.Document r11 = r11.parse(r5)     // Catch: java.lang.Throwable -> Lba java.lang.Exception -> Lbc
            r11.normalize()     // Catch: java.lang.Throwable -> Lba java.lang.Exception -> Lbc
            org.w3c.dom.Element r11 = r11.getDocumentElement()     // Catch: java.lang.Throwable -> Lba java.lang.Exception -> Lbc
            java.lang.String r3 = "item"
            org.w3c.dom.NodeList r11 = r11.getElementsByTagName(r3)     // Catch: java.lang.Throwable -> Lba java.lang.Exception -> Lbc
            if (r11 == 0) goto Lb4
            int r3 = r11.getLength()     // Catch: java.lang.Throwable -> Lba java.lang.Exception -> Lbc
            if (r3 <= 0) goto Lb4
            int r3 = r11.getLength()     // Catch: java.lang.Throwable -> Lba java.lang.Exception -> Lbc
            r6 = r4
        L35:
            if (r6 >= r3) goto Lb4
            org.w3c.dom.Node r7 = r11.item(r6)     // Catch: java.lang.Throwable -> Lba java.lang.Exception -> Lbc
            if (r7 == 0) goto Lb1
            java.lang.String r8 = r7.getTextContent()     // Catch: java.lang.Throwable -> Lba java.lang.Exception -> Lbc
            boolean r8 = com.tencent.mm.sdk.platformtools.t8.K0(r8)     // Catch: java.lang.Throwable -> Lba java.lang.Exception -> Lbc
            if (r8 != 0) goto Lb1
            java.lang.String r7 = r7.getTextContent()     // Catch: java.lang.Throwable -> Lba java.lang.Exception -> Lbc
            java.lang.String r8 = "\""
            java.lang.String r7 = r7.replaceAll(r8, r0)     // Catch: java.lang.Throwable -> Lba java.lang.Exception -> Lbc
            java.lang.String r8 = "^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?$"
            boolean r8 = r7.matches(r8)     // Catch: java.lang.Throwable -> Lba java.lang.Exception -> Lbc
            if (r8 == 0) goto L63
            java.lang.String r8 = new java.lang.String     // Catch: java.lang.Throwable -> Lba java.lang.Exception -> Lbc
            byte[] r7 = android.util.Base64.decode(r7, r4)     // Catch: java.lang.Throwable -> Lba java.lang.Exception -> Lbc
            r8.<init>(r7)     // Catch: java.lang.Throwable -> Lba java.lang.Exception -> Lbc
            r7 = r8
        L63:
            java.lang.String r8 = "\\\\u"
            boolean r8 = r7.startsWith(r8)     // Catch: java.lang.Throwable -> Lba java.lang.Exception -> Lbc
            if (r8 == 0) goto L98
            r8 = 3
            java.lang.String r7 = r7.substring(r8)     // Catch: java.lang.Throwable -> Lba java.lang.Exception -> Lbc
            r8 = 16
            int r7 = java.lang.Integer.parseInt(r7, r8)     // Catch: java.lang.Throwable -> Lba java.lang.Exception -> Lbc
            char[] r7 = java.lang.Character.toChars(r7)     // Catch: java.lang.Throwable -> Lba java.lang.Exception -> Lbc
            r8 = r0
            r9 = r4
        L7c:
            int r10 = r7.length     // Catch: java.lang.Throwable -> Lba java.lang.Exception -> Lbc
            if (r9 >= r10) goto L97
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lba java.lang.Exception -> Lbc
            r10.<init>()     // Catch: java.lang.Throwable -> Lba java.lang.Exception -> Lbc
            r10.append(r8)     // Catch: java.lang.Throwable -> Lba java.lang.Exception -> Lbc
            char r8 = r7[r9]     // Catch: java.lang.Throwable -> Lba java.lang.Exception -> Lbc
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> Lba java.lang.Exception -> Lbc
            r10.append(r8)     // Catch: java.lang.Throwable -> Lba java.lang.Exception -> Lbc
            java.lang.String r8 = r10.toString()     // Catch: java.lang.Throwable -> Lba java.lang.Exception -> Lbc
            int r9 = r9 + 1
            goto L7c
        L97:
            r7 = r8
        L98:
            com.tencent.mm.storage.emotion.SmileyPanelConfigInfo r8 = new com.tencent.mm.storage.emotion.SmileyPanelConfigInfo     // Catch: java.lang.Throwable -> Lba java.lang.Exception -> Lbc
            r8.<init>(r6, r7)     // Catch: java.lang.Throwable -> Lba java.lang.Exception -> Lbc
            java.lang.String r7 = r8.field_key     // Catch: java.lang.Throwable -> Lba java.lang.Exception -> Lbc
            boolean r7 = com.tencent.mm.sdk.platformtools.t8.K0(r7)     // Catch: java.lang.Throwable -> Lba java.lang.Exception -> Lbc
            if (r7 == 0) goto Lab
            java.lang.String r7 = "key is null."
            com.tencent.mars.xlog.Log.i(r1, r7)     // Catch: java.lang.Throwable -> Lba java.lang.Exception -> Lbc
            goto Lae
        Lab:
            r2.add(r8)     // Catch: java.lang.Throwable -> Lba java.lang.Exception -> Lbc
        Lae:
            r8.toString()     // Catch: java.lang.Throwable -> Lba java.lang.Exception -> Lbc
        Lb1:
            int r6 = r6 + 1
            goto L35
        Lb4:
            if (r5 == 0) goto Lcf
        Lb6:
            r5.close()     // Catch: java.io.IOException -> Lcf
            goto Lcf
        Lba:
            r11 = move-exception
            goto Ld0
        Lbc:
            r11 = move-exception
            java.lang.String r0 = "parseSmileyPanelConfig parseXML exception:%s"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> Lba
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> Lba
            r3[r4] = r11     // Catch: java.lang.Throwable -> Lba
            com.tencent.mars.xlog.Log.e(r1, r0, r3)     // Catch: java.lang.Throwable -> Lba
            if (r5 == 0) goto Lcf
            goto Lb6
        Lcf:
            return r2
        Ld0:
            if (r5 == 0) goto Ld5
            r5.close()     // Catch: java.io.IOException -> Ld5
        Ld5:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: rr.t.a(com.tencent.mm.vfs.r6):java.util.ArrayList");
    }

    public static f21.g b(com.tencent.mm.vfs.r6 r6Var) {
        try {
            gr.k kVar = new gr.k();
            gr.b.f274661a.a(r6Var.o(), kVar);
            f21.g gVar = kVar.f274669b;
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiResHelper", "parserEmojiEggConfig: %s", java.lang.Integer.valueOf(gVar.f258898d.size()));
            return gVar;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.EmojiResHelper", e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    public static java.util.ArrayList c(com.tencent.mm.vfs.r6 r6Var) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        javax.xml.parsers.DocumentBuilderFactory newInstance = javax.xml.parsers.DocumentBuilderFactory.newInstance();
        try {
            java.io.InputStream C = com.tencent.mm.vfs.w6.C(r6Var);
            try {
                org.w3c.dom.Document parse = newInstance.newDocumentBuilder().parse(C);
                parse.normalize();
                org.w3c.dom.NodeList elementsByTagName = parse.getDocumentElement().getElementsByTagName("emoji");
                if (elementsByTagName != null && elementsByTagName.getLength() > 0) {
                    int length = elementsByTagName.getLength();
                    for (int i17 = 0; i17 < length; i17++) {
                        org.w3c.dom.NodeList childNodes = elementsByTagName.item(i17).getChildNodes();
                        if (childNodes != null && childNodes.getLength() > 0) {
                            com.tencent.mm.storage.emotion.SmileyInfo smileyInfo = new com.tencent.mm.storage.emotion.SmileyInfo();
                            int i18 = 0;
                            while (true) {
                                int i19 = -1;
                                if (i18 >= childNodes.getLength()) {
                                    break;
                                }
                                org.w3c.dom.Node item = childNodes.item(i18);
                                java.lang.String nodeName = item.getNodeName();
                                if (nodeName.equalsIgnoreCase("key")) {
                                    smileyInfo.field_key = item.getTextContent();
                                } else if (nodeName.equalsIgnoreCase("cn-value")) {
                                    if (!com.tencent.mm.sdk.platformtools.t8.K0(item.getTextContent()) && !"null".equalsIgnoreCase(item.getTextContent())) {
                                        smileyInfo.field_cnValue = item.getTextContent();
                                    }
                                    smileyInfo.field_cnValue = smileyInfo.field_key;
                                } else if (nodeName.equalsIgnoreCase("qq-value")) {
                                    if (!com.tencent.mm.sdk.platformtools.t8.K0(item.getTextContent()) && !"null".equalsIgnoreCase(item.getTextContent())) {
                                        smileyInfo.field_qqValue = item.getTextContent();
                                    }
                                    smileyInfo.field_qqValue = smileyInfo.field_key;
                                } else if (nodeName.equalsIgnoreCase("en-value")) {
                                    if (!com.tencent.mm.sdk.platformtools.t8.K0(item.getTextContent()) && !"null".equalsIgnoreCase(item.getTextContent())) {
                                        smileyInfo.field_enValue = item.getTextContent();
                                    }
                                    smileyInfo.field_enValue = smileyInfo.field_key;
                                } else if (nodeName.equalsIgnoreCase("tw-value")) {
                                    if (!com.tencent.mm.sdk.platformtools.t8.K0(item.getTextContent()) && !"null".equalsIgnoreCase(item.getTextContent())) {
                                        smileyInfo.field_twValue = item.getTextContent();
                                    }
                                    smileyInfo.field_twValue = smileyInfo.field_key;
                                } else if (nodeName.equalsIgnoreCase("th-value")) {
                                    if (!com.tencent.mm.sdk.platformtools.t8.K0(item.getTextContent()) && !"null".equalsIgnoreCase(item.getTextContent())) {
                                        smileyInfo.field_thValue = item.getTextContent();
                                    }
                                    smileyInfo.field_thValue = smileyInfo.field_key;
                                } else if (nodeName.equalsIgnoreCase(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.FILENAME)) {
                                    smileyInfo.field_fileName = item.getTextContent();
                                } else if (nodeName.equalsIgnoreCase("eggIndex")) {
                                    try {
                                        i19 = java.lang.Integer.valueOf(item.getTextContent()).intValue();
                                    } catch (java.lang.Exception e17) {
                                        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                                        com.tencent.mars.xlog.Log.e("MicroMsg.EmojiResHelper", com.tencent.mm.sdk.platformtools.z3.c(e17));
                                    }
                                    smileyInfo.field_eggIndex = i19;
                                }
                                i18++;
                            }
                            smileyInfo.field_position = -1;
                            smileyInfo.toString();
                            if (com.tencent.mm.sdk.platformtools.t8.K0(smileyInfo.field_key)) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.EmojiResHelper", "key is empty");
                            } else {
                                arrayList.add(smileyInfo);
                            }
                        }
                    }
                }
                if (C != null) {
                    C.close();
                }
            } finally {
            }
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.EmojiResHelper", "parserSmileyConfig parseXML exception:%s", e18.toString());
        }
        if (arrayList.size() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.EmojiResHelper", "parserSmileyConfig empty!");
        }
        return arrayList;
    }

    public static int d(java.lang.String str) {
        int i17 = -1;
        if (com.tencent.mm.vfs.w6.j(str)) {
            try {
                i17 = new cl0.g(com.tencent.mm.vfs.w6.M(str)).optInt("version", -1);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.EmojiResHelper", e17, "readConfigVersion fail", new java.lang.Object[0]);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiResHelper", "readConfigVersion: %s, %s", java.lang.Integer.valueOf(i17), str);
        return i17;
    }
}
