package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes8.dex */
public final class q8 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.q8 f186456d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.q8();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x032d A[Catch: Exception -> 0x0430, TryCatch #0 {Exception -> 0x0430, blocks: (B:68:0x0292, B:74:0x029b, B:75:0x02a5, B:77:0x02af, B:79:0x02b5, B:81:0x02c2, B:83:0x02cb, B:84:0x02cd, B:86:0x02d5, B:87:0x02df, B:89:0x02e7, B:90:0x02ed, B:92:0x02fa, B:93:0x02ff, B:95:0x0307, B:97:0x0311, B:100:0x031d, B:105:0x0329, B:107:0x032d, B:108:0x0332, B:110:0x0340, B:114:0x034c, B:116:0x035f, B:117:0x0363, B:119:0x036f, B:120:0x0373, B:122:0x038f, B:123:0x0397, B:125:0x03af, B:136:0x02fd), top: B:67:0x0292 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0340 A[Catch: Exception -> 0x0430, TryCatch #0 {Exception -> 0x0430, blocks: (B:68:0x0292, B:74:0x029b, B:75:0x02a5, B:77:0x02af, B:79:0x02b5, B:81:0x02c2, B:83:0x02cb, B:84:0x02cd, B:86:0x02d5, B:87:0x02df, B:89:0x02e7, B:90:0x02ed, B:92:0x02fa, B:93:0x02ff, B:95:0x0307, B:97:0x0311, B:100:0x031d, B:105:0x0329, B:107:0x032d, B:108:0x0332, B:110:0x0340, B:114:0x034c, B:116:0x035f, B:117:0x0363, B:119:0x036f, B:120:0x0373, B:122:0x038f, B:123:0x0397, B:125:0x03af, B:136:0x02fd), top: B:67:0x0292 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x035f A[Catch: Exception -> 0x0430, TryCatch #0 {Exception -> 0x0430, blocks: (B:68:0x0292, B:74:0x029b, B:75:0x02a5, B:77:0x02af, B:79:0x02b5, B:81:0x02c2, B:83:0x02cb, B:84:0x02cd, B:86:0x02d5, B:87:0x02df, B:89:0x02e7, B:90:0x02ed, B:92:0x02fa, B:93:0x02ff, B:95:0x0307, B:97:0x0311, B:100:0x031d, B:105:0x0329, B:107:0x032d, B:108:0x0332, B:110:0x0340, B:114:0x034c, B:116:0x035f, B:117:0x0363, B:119:0x036f, B:120:0x0373, B:122:0x038f, B:123:0x0397, B:125:0x03af, B:136:0x02fd), top: B:67:0x0292 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x036f A[Catch: Exception -> 0x0430, TryCatch #0 {Exception -> 0x0430, blocks: (B:68:0x0292, B:74:0x029b, B:75:0x02a5, B:77:0x02af, B:79:0x02b5, B:81:0x02c2, B:83:0x02cb, B:84:0x02cd, B:86:0x02d5, B:87:0x02df, B:89:0x02e7, B:90:0x02ed, B:92:0x02fa, B:93:0x02ff, B:95:0x0307, B:97:0x0311, B:100:0x031d, B:105:0x0329, B:107:0x032d, B:108:0x0332, B:110:0x0340, B:114:0x034c, B:116:0x035f, B:117:0x0363, B:119:0x036f, B:120:0x0373, B:122:0x038f, B:123:0x0397, B:125:0x03af, B:136:0x02fd), top: B:67:0x0292 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x038f A[Catch: Exception -> 0x0430, TryCatch #0 {Exception -> 0x0430, blocks: (B:68:0x0292, B:74:0x029b, B:75:0x02a5, B:77:0x02af, B:79:0x02b5, B:81:0x02c2, B:83:0x02cb, B:84:0x02cd, B:86:0x02d5, B:87:0x02df, B:89:0x02e7, B:90:0x02ed, B:92:0x02fa, B:93:0x02ff, B:95:0x0307, B:97:0x0311, B:100:0x031d, B:105:0x0329, B:107:0x032d, B:108:0x0332, B:110:0x0340, B:114:0x034c, B:116:0x035f, B:117:0x0363, B:119:0x036f, B:120:0x0373, B:122:0x038f, B:123:0x0397, B:125:0x03af, B:136:0x02fd), top: B:67:0x0292 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03af A[Catch: Exception -> 0x0430, TRY_LEAVE, TryCatch #0 {Exception -> 0x0430, blocks: (B:68:0x0292, B:74:0x029b, B:75:0x02a5, B:77:0x02af, B:79:0x02b5, B:81:0x02c2, B:83:0x02cb, B:84:0x02cd, B:86:0x02d5, B:87:0x02df, B:89:0x02e7, B:90:0x02ed, B:92:0x02fa, B:93:0x02ff, B:95:0x0307, B:97:0x0311, B:100:0x031d, B:105:0x0329, B:107:0x032d, B:108:0x0332, B:110:0x0340, B:114:0x034c, B:116:0x035f, B:117:0x0363, B:119:0x036f, B:120:0x0373, B:122:0x038f, B:123:0x0397, B:125:0x03af, B:136:0x02fd), top: B:67:0x0292 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0104 A[Catch: Exception -> 0x0432, TRY_ENTER, TryCatch #6 {Exception -> 0x0432, blocks: (B:9:0x00fc, B:12:0x0104, B:13:0x0110, B:15:0x0116, B:16:0x011c, B:18:0x0122, B:19:0x0128, B:21:0x012e, B:22:0x0141, B:24:0x0147, B:26:0x014d, B:27:0x0151, B:29:0x0157, B:31:0x015d, B:32:0x0160, B:34:0x0166, B:36:0x016c, B:37:0x016f, B:39:0x0175, B:40:0x01c0, B:153:0x01f3, B:44:0x020a, B:46:0x0212, B:47:0x021d, B:49:0x022b, B:51:0x0237, B:143:0x0242, B:145:0x024a, B:146:0x024f, B:161:0x0183, B:163:0x018e, B:164:0x0194, B:166:0x019c, B:168:0x01a5, B:169:0x01a7, B:171:0x01af, B:173:0x01b8, B:174:0x01bc), top: B:8:0x00fc }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02fd A[Catch: Exception -> 0x0430, TryCatch #0 {Exception -> 0x0430, blocks: (B:68:0x0292, B:74:0x029b, B:75:0x02a5, B:77:0x02af, B:79:0x02b5, B:81:0x02c2, B:83:0x02cb, B:84:0x02cd, B:86:0x02d5, B:87:0x02df, B:89:0x02e7, B:90:0x02ed, B:92:0x02fa, B:93:0x02ff, B:95:0x0307, B:97:0x0311, B:100:0x031d, B:105:0x0329, B:107:0x032d, B:108:0x0332, B:110:0x0340, B:114:0x034c, B:116:0x035f, B:117:0x0363, B:119:0x036f, B:120:0x0373, B:122:0x038f, B:123:0x0397, B:125:0x03af, B:136:0x02fd), top: B:67:0x0292 }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x024f A[Catch: Exception -> 0x0432, TRY_LEAVE, TryCatch #6 {Exception -> 0x0432, blocks: (B:9:0x00fc, B:12:0x0104, B:13:0x0110, B:15:0x0116, B:16:0x011c, B:18:0x0122, B:19:0x0128, B:21:0x012e, B:22:0x0141, B:24:0x0147, B:26:0x014d, B:27:0x0151, B:29:0x0157, B:31:0x015d, B:32:0x0160, B:34:0x0166, B:36:0x016c, B:37:0x016f, B:39:0x0175, B:40:0x01c0, B:153:0x01f3, B:44:0x020a, B:46:0x0212, B:47:0x021d, B:49:0x022b, B:51:0x0237, B:143:0x0242, B:145:0x024a, B:146:0x024f, B:161:0x0183, B:163:0x018e, B:164:0x0194, B:166:0x019c, B:168:0x01a5, B:169:0x01a7, B:171:0x01af, B:173:0x01b8, B:174:0x01bc), top: B:8:0x00fc }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0116 A[Catch: Exception -> 0x0432, TryCatch #6 {Exception -> 0x0432, blocks: (B:9:0x00fc, B:12:0x0104, B:13:0x0110, B:15:0x0116, B:16:0x011c, B:18:0x0122, B:19:0x0128, B:21:0x012e, B:22:0x0141, B:24:0x0147, B:26:0x014d, B:27:0x0151, B:29:0x0157, B:31:0x015d, B:32:0x0160, B:34:0x0166, B:36:0x016c, B:37:0x016f, B:39:0x0175, B:40:0x01c0, B:153:0x01f3, B:44:0x020a, B:46:0x0212, B:47:0x021d, B:49:0x022b, B:51:0x0237, B:143:0x0242, B:145:0x024a, B:146:0x024f, B:161:0x0183, B:163:0x018e, B:164:0x0194, B:166:0x019c, B:168:0x01a5, B:169:0x01a7, B:171:0x01af, B:173:0x01b8, B:174:0x01bc), top: B:8:0x00fc }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0183 A[Catch: Exception -> 0x0432, TryCatch #6 {Exception -> 0x0432, blocks: (B:9:0x00fc, B:12:0x0104, B:13:0x0110, B:15:0x0116, B:16:0x011c, B:18:0x0122, B:19:0x0128, B:21:0x012e, B:22:0x0141, B:24:0x0147, B:26:0x014d, B:27:0x0151, B:29:0x0157, B:31:0x015d, B:32:0x0160, B:34:0x0166, B:36:0x016c, B:37:0x016f, B:39:0x0175, B:40:0x01c0, B:153:0x01f3, B:44:0x020a, B:46:0x0212, B:47:0x021d, B:49:0x022b, B:51:0x0237, B:143:0x0242, B:145:0x024a, B:146:0x024f, B:161:0x0183, B:163:0x018e, B:164:0x0194, B:166:0x019c, B:168:0x01a5, B:169:0x01a7, B:171:0x01af, B:173:0x01b8, B:174:0x01bc), top: B:8:0x00fc }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0122 A[Catch: Exception -> 0x0432, TryCatch #6 {Exception -> 0x0432, blocks: (B:9:0x00fc, B:12:0x0104, B:13:0x0110, B:15:0x0116, B:16:0x011c, B:18:0x0122, B:19:0x0128, B:21:0x012e, B:22:0x0141, B:24:0x0147, B:26:0x014d, B:27:0x0151, B:29:0x0157, B:31:0x015d, B:32:0x0160, B:34:0x0166, B:36:0x016c, B:37:0x016f, B:39:0x0175, B:40:0x01c0, B:153:0x01f3, B:44:0x020a, B:46:0x0212, B:47:0x021d, B:49:0x022b, B:51:0x0237, B:143:0x0242, B:145:0x024a, B:146:0x024f, B:161:0x0183, B:163:0x018e, B:164:0x0194, B:166:0x019c, B:168:0x01a5, B:169:0x01a7, B:171:0x01af, B:173:0x01b8, B:174:0x01bc), top: B:8:0x00fc }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x012e A[Catch: Exception -> 0x0432, TryCatch #6 {Exception -> 0x0432, blocks: (B:9:0x00fc, B:12:0x0104, B:13:0x0110, B:15:0x0116, B:16:0x011c, B:18:0x0122, B:19:0x0128, B:21:0x012e, B:22:0x0141, B:24:0x0147, B:26:0x014d, B:27:0x0151, B:29:0x0157, B:31:0x015d, B:32:0x0160, B:34:0x0166, B:36:0x016c, B:37:0x016f, B:39:0x0175, B:40:0x01c0, B:153:0x01f3, B:44:0x020a, B:46:0x0212, B:47:0x021d, B:49:0x022b, B:51:0x0237, B:143:0x0242, B:145:0x024a, B:146:0x024f, B:161:0x0183, B:163:0x018e, B:164:0x0194, B:166:0x019c, B:168:0x01a5, B:169:0x01a7, B:171:0x01af, B:173:0x01b8, B:174:0x01bc), top: B:8:0x00fc }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0147 A[Catch: Exception -> 0x0432, TryCatch #6 {Exception -> 0x0432, blocks: (B:9:0x00fc, B:12:0x0104, B:13:0x0110, B:15:0x0116, B:16:0x011c, B:18:0x0122, B:19:0x0128, B:21:0x012e, B:22:0x0141, B:24:0x0147, B:26:0x014d, B:27:0x0151, B:29:0x0157, B:31:0x015d, B:32:0x0160, B:34:0x0166, B:36:0x016c, B:37:0x016f, B:39:0x0175, B:40:0x01c0, B:153:0x01f3, B:44:0x020a, B:46:0x0212, B:47:0x021d, B:49:0x022b, B:51:0x0237, B:143:0x0242, B:145:0x024a, B:146:0x024f, B:161:0x0183, B:163:0x018e, B:164:0x0194, B:166:0x019c, B:168:0x01a5, B:169:0x01a7, B:171:0x01af, B:173:0x01b8, B:174:0x01bc), top: B:8:0x00fc }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0157 A[Catch: Exception -> 0x0432, TryCatch #6 {Exception -> 0x0432, blocks: (B:9:0x00fc, B:12:0x0104, B:13:0x0110, B:15:0x0116, B:16:0x011c, B:18:0x0122, B:19:0x0128, B:21:0x012e, B:22:0x0141, B:24:0x0147, B:26:0x014d, B:27:0x0151, B:29:0x0157, B:31:0x015d, B:32:0x0160, B:34:0x0166, B:36:0x016c, B:37:0x016f, B:39:0x0175, B:40:0x01c0, B:153:0x01f3, B:44:0x020a, B:46:0x0212, B:47:0x021d, B:49:0x022b, B:51:0x0237, B:143:0x0242, B:145:0x024a, B:146:0x024f, B:161:0x0183, B:163:0x018e, B:164:0x0194, B:166:0x019c, B:168:0x01a5, B:169:0x01a7, B:171:0x01af, B:173:0x01b8, B:174:0x01bc), top: B:8:0x00fc }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0166 A[Catch: Exception -> 0x0432, TryCatch #6 {Exception -> 0x0432, blocks: (B:9:0x00fc, B:12:0x0104, B:13:0x0110, B:15:0x0116, B:16:0x011c, B:18:0x0122, B:19:0x0128, B:21:0x012e, B:22:0x0141, B:24:0x0147, B:26:0x014d, B:27:0x0151, B:29:0x0157, B:31:0x015d, B:32:0x0160, B:34:0x0166, B:36:0x016c, B:37:0x016f, B:39:0x0175, B:40:0x01c0, B:153:0x01f3, B:44:0x020a, B:46:0x0212, B:47:0x021d, B:49:0x022b, B:51:0x0237, B:143:0x0242, B:145:0x024a, B:146:0x024f, B:161:0x0183, B:163:0x018e, B:164:0x0194, B:166:0x019c, B:168:0x01a5, B:169:0x01a7, B:171:0x01af, B:173:0x01b8, B:174:0x01bc), top: B:8:0x00fc }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0175 A[Catch: Exception -> 0x0432, TryCatch #6 {Exception -> 0x0432, blocks: (B:9:0x00fc, B:12:0x0104, B:13:0x0110, B:15:0x0116, B:16:0x011c, B:18:0x0122, B:19:0x0128, B:21:0x012e, B:22:0x0141, B:24:0x0147, B:26:0x014d, B:27:0x0151, B:29:0x0157, B:31:0x015d, B:32:0x0160, B:34:0x0166, B:36:0x016c, B:37:0x016f, B:39:0x0175, B:40:0x01c0, B:153:0x01f3, B:44:0x020a, B:46:0x0212, B:47:0x021d, B:49:0x022b, B:51:0x0237, B:143:0x0242, B:145:0x024a, B:146:0x024f, B:161:0x0183, B:163:0x018e, B:164:0x0194, B:166:0x019c, B:168:0x01a5, B:169:0x01a7, B:171:0x01af, B:173:0x01b8, B:174:0x01bc), top: B:8:0x00fc }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0212 A[Catch: Exception -> 0x0432, TryCatch #6 {Exception -> 0x0432, blocks: (B:9:0x00fc, B:12:0x0104, B:13:0x0110, B:15:0x0116, B:16:0x011c, B:18:0x0122, B:19:0x0128, B:21:0x012e, B:22:0x0141, B:24:0x0147, B:26:0x014d, B:27:0x0151, B:29:0x0157, B:31:0x015d, B:32:0x0160, B:34:0x0166, B:36:0x016c, B:37:0x016f, B:39:0x0175, B:40:0x01c0, B:153:0x01f3, B:44:0x020a, B:46:0x0212, B:47:0x021d, B:49:0x022b, B:51:0x0237, B:143:0x0242, B:145:0x024a, B:146:0x024f, B:161:0x0183, B:163:0x018e, B:164:0x0194, B:166:0x019c, B:168:0x01a5, B:169:0x01a7, B:171:0x01af, B:173:0x01b8, B:174:0x01bc), top: B:8:0x00fc }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x022b A[Catch: Exception -> 0x0432, TryCatch #6 {Exception -> 0x0432, blocks: (B:9:0x00fc, B:12:0x0104, B:13:0x0110, B:15:0x0116, B:16:0x011c, B:18:0x0122, B:19:0x0128, B:21:0x012e, B:22:0x0141, B:24:0x0147, B:26:0x014d, B:27:0x0151, B:29:0x0157, B:31:0x015d, B:32:0x0160, B:34:0x0166, B:36:0x016c, B:37:0x016f, B:39:0x0175, B:40:0x01c0, B:153:0x01f3, B:44:0x020a, B:46:0x0212, B:47:0x021d, B:49:0x022b, B:51:0x0237, B:143:0x0242, B:145:0x024a, B:146:0x024f, B:161:0x0183, B:163:0x018e, B:164:0x0194, B:166:0x019c, B:168:0x01a5, B:169:0x01a7, B:171:0x01af, B:173:0x01b8, B:174:0x01bc), top: B:8:0x00fc }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0263 A[Catch: Exception -> 0x029e, TryCatch #2 {Exception -> 0x029e, blocks: (B:54:0x0257, B:56:0x0263, B:59:0x026b, B:60:0x0273, B:62:0x027d, B:64:0x0283, B:139:0x026e), top: B:53:0x0257 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0269 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x027d A[Catch: Exception -> 0x029e, TryCatch #2 {Exception -> 0x029e, blocks: (B:54:0x0257, B:56:0x0263, B:59:0x026b, B:60:0x0273, B:62:0x027d, B:64:0x0283, B:139:0x026e), top: B:53:0x0257 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02af A[Catch: Exception -> 0x0430, TryCatch #0 {Exception -> 0x0430, blocks: (B:68:0x0292, B:74:0x029b, B:75:0x02a5, B:77:0x02af, B:79:0x02b5, B:81:0x02c2, B:83:0x02cb, B:84:0x02cd, B:86:0x02d5, B:87:0x02df, B:89:0x02e7, B:90:0x02ed, B:92:0x02fa, B:93:0x02ff, B:95:0x0307, B:97:0x0311, B:100:0x031d, B:105:0x0329, B:107:0x032d, B:108:0x0332, B:110:0x0340, B:114:0x034c, B:116:0x035f, B:117:0x0363, B:119:0x036f, B:120:0x0373, B:122:0x038f, B:123:0x0397, B:125:0x03af, B:136:0x02fd), top: B:67:0x0292 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02c2 A[Catch: Exception -> 0x0430, LOOP:1: B:80:0x02c0->B:81:0x02c2, LOOP_END, TryCatch #0 {Exception -> 0x0430, blocks: (B:68:0x0292, B:74:0x029b, B:75:0x02a5, B:77:0x02af, B:79:0x02b5, B:81:0x02c2, B:83:0x02cb, B:84:0x02cd, B:86:0x02d5, B:87:0x02df, B:89:0x02e7, B:90:0x02ed, B:92:0x02fa, B:93:0x02ff, B:95:0x0307, B:97:0x0311, B:100:0x031d, B:105:0x0329, B:107:0x032d, B:108:0x0332, B:110:0x0340, B:114:0x034c, B:116:0x035f, B:117:0x0363, B:119:0x036f, B:120:0x0373, B:122:0x038f, B:123:0x0397, B:125:0x03af, B:136:0x02fd), top: B:67:0x0292 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02d5 A[Catch: Exception -> 0x0430, TryCatch #0 {Exception -> 0x0430, blocks: (B:68:0x0292, B:74:0x029b, B:75:0x02a5, B:77:0x02af, B:79:0x02b5, B:81:0x02c2, B:83:0x02cb, B:84:0x02cd, B:86:0x02d5, B:87:0x02df, B:89:0x02e7, B:90:0x02ed, B:92:0x02fa, B:93:0x02ff, B:95:0x0307, B:97:0x0311, B:100:0x031d, B:105:0x0329, B:107:0x032d, B:108:0x0332, B:110:0x0340, B:114:0x034c, B:116:0x035f, B:117:0x0363, B:119:0x036f, B:120:0x0373, B:122:0x038f, B:123:0x0397, B:125:0x03af, B:136:0x02fd), top: B:67:0x0292 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02e7 A[Catch: Exception -> 0x0430, TryCatch #0 {Exception -> 0x0430, blocks: (B:68:0x0292, B:74:0x029b, B:75:0x02a5, B:77:0x02af, B:79:0x02b5, B:81:0x02c2, B:83:0x02cb, B:84:0x02cd, B:86:0x02d5, B:87:0x02df, B:89:0x02e7, B:90:0x02ed, B:92:0x02fa, B:93:0x02ff, B:95:0x0307, B:97:0x0311, B:100:0x031d, B:105:0x0329, B:107:0x032d, B:108:0x0332, B:110:0x0340, B:114:0x034c, B:116:0x035f, B:117:0x0363, B:119:0x036f, B:120:0x0373, B:122:0x038f, B:123:0x0397, B:125:0x03af, B:136:0x02fd), top: B:67:0x0292 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02fa A[Catch: Exception -> 0x0430, TryCatch #0 {Exception -> 0x0430, blocks: (B:68:0x0292, B:74:0x029b, B:75:0x02a5, B:77:0x02af, B:79:0x02b5, B:81:0x02c2, B:83:0x02cb, B:84:0x02cd, B:86:0x02d5, B:87:0x02df, B:89:0x02e7, B:90:0x02ed, B:92:0x02fa, B:93:0x02ff, B:95:0x0307, B:97:0x0311, B:100:0x031d, B:105:0x0329, B:107:0x032d, B:108:0x0332, B:110:0x0340, B:114:0x034c, B:116:0x035f, B:117:0x0363, B:119:0x036f, B:120:0x0373, B:122:0x038f, B:123:0x0397, B:125:0x03af, B:136:0x02fd), top: B:67:0x0292 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0307 A[Catch: Exception -> 0x0430, TryCatch #0 {Exception -> 0x0430, blocks: (B:68:0x0292, B:74:0x029b, B:75:0x02a5, B:77:0x02af, B:79:0x02b5, B:81:0x02c2, B:83:0x02cb, B:84:0x02cd, B:86:0x02d5, B:87:0x02df, B:89:0x02e7, B:90:0x02ed, B:92:0x02fa, B:93:0x02ff, B:95:0x0307, B:97:0x0311, B:100:0x031d, B:105:0x0329, B:107:0x032d, B:108:0x0332, B:110:0x0340, B:114:0x034c, B:116:0x035f, B:117:0x0363, B:119:0x036f, B:120:0x0373, B:122:0x038f, B:123:0x0397, B:125:0x03af, B:136:0x02fd), top: B:67:0x0292 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x031b  */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // nw4.q2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(nw4.k r32, nw4.y2 r33) {
        /*
            Method dump skipped, instructions count: 1114
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.newjsapi.q8.a(nw4.k, nw4.y2):boolean");
    }

    @Override // nw4.q2
    public int b() {
        return nd1.u0.CTRL_INDEX;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "openLiteApp";
    }

    public final boolean e(java.lang.String str, java.lang.String str2) {
        java.util.List list;
        if (str != null) {
            if (!(str.length() == 0)) {
                if (str2 != null) {
                    if (!(str2.length() == 0)) {
                        java.util.List g17 = new r26.t("\\.").g(str, 0);
                        boolean isEmpty = g17.isEmpty();
                        java.util.List list2 = kz5.p0.f313996d;
                        if (!isEmpty) {
                            java.util.ListIterator listIterator = g17.listIterator(g17.size());
                            while (listIterator.hasPrevious()) {
                                if (!(((java.lang.String) listIterator.previous()).length() == 0)) {
                                    list = kz5.n0.K0(g17, listIterator.nextIndex() + 1);
                                    break;
                                }
                            }
                        }
                        list = list2;
                        java.lang.String[] strArr = (java.lang.String[]) list.toArray(new java.lang.String[0]);
                        java.util.List g18 = new r26.t("\\.").g(str2, 0);
                        if (!g18.isEmpty()) {
                            java.util.ListIterator listIterator2 = g18.listIterator(g18.size());
                            while (true) {
                                if (!listIterator2.hasPrevious()) {
                                    break;
                                }
                                if (!(((java.lang.String) listIterator2.previous()).length() == 0)) {
                                    list2 = kz5.n0.K0(g18, listIterator2.nextIndex() + 1);
                                    break;
                                }
                            }
                        }
                        java.lang.String[] strArr2 = (java.lang.String[]) list2.toArray(new java.lang.String[0]);
                        int min = java.lang.Math.min(strArr.length, strArr2.length);
                        for (int i17 = 0; i17 < min; i17++) {
                            if (!kotlin.jvm.internal.o.b(strArr[i17], strArr2[i17])) {
                                if (strArr[i17].length() > strArr2[i17].length()) {
                                    return true;
                                }
                                return strArr[i17].length() >= strArr2[i17].length() && strArr[i17].compareTo(strArr2[i17]) > 0;
                            }
                        }
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
