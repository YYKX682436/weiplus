package ra3;

/* loaded from: classes.dex */
public final class n {
    public n(kotlin.jvm.internal.i iVar) {
    }

    public final ra3.o a(java.lang.String baseLibPath) {
        kotlin.jvm.internal.o.g(baseLibPath, "baseLibPath");
        synchronized (this) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.util.Map map = ra3.p.f393526b;
            if (map.containsKey(baseLibPath)) {
                java.lang.Object obj = ((java.util.LinkedHashMap) map).get(baseLibPath);
                kotlin.jvm.internal.o.d(obj);
                if (currentTimeMillis - ((java.lang.Number) obj).longValue() < 500) {
                    com.tencent.mars.xlog.Log.i("LiteAppHelper", "baseLibPath:" + baseLibPath + " has recently check.");
                    return new ra3.o(true, "");
                }
            }
            map.put(baseLibPath, java.lang.Long.valueOf(currentTimeMillis));
            try {
                try {
                    try {
                        try {
                            com.tencent.mm.vfs.x1 m17 = com.tencent.mm.vfs.w6.m(baseLibPath);
                            java.util.Set set = null;
                            java.lang.String str = m17 != null ? m17.f213231a : null;
                            if (str == null) {
                                com.tencent.mars.xlog.Log.e("LiteAppHelper", "packageRelPath == null");
                                ra3.o oVar = new ra3.o(false, baseLibPath);
                                com.tencent.mars.xlog.Log.i("LiteAppHelper", "check_package_integrity " + baseLibPath + " Execution time: " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
                                return oVar;
                            }
                            int length = str.length() + 1;
                            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(baseLibPath.concat("/signatures.json"));
                            java.lang.String str2 = a17.f213279f;
                            if (str2 != null) {
                                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
                                if (!a17.f213279f.equals(l17)) {
                                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                                }
                            }
                            com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
                            if (!(!m18.a() ? false : m18.f213266a.F(m18.f213267b))) {
                                com.tencent.mars.xlog.Log.e("LiteAppHelper", "signatures not exist");
                                ra3.o oVar2 = new ra3.o(false, "signatures.json");
                                com.tencent.mars.xlog.Log.i("LiteAppHelper", "check_package_integrity " + baseLibPath + " Execution time: " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
                                return oVar2;
                            }
                            java.lang.Iterable s17 = com.tencent.mm.vfs.w6.s(baseLibPath, true);
                            if (s17 != null) {
                                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(s17, 10));
                                java.util.Iterator it = s17.iterator();
                                while (it.hasNext()) {
                                    java.lang.String relPath = ((com.tencent.mm.vfs.x1) it.next()).f213231a;
                                    kotlin.jvm.internal.o.f(relPath, "relPath");
                                    java.lang.String substring = relPath.substring(length);
                                    kotlin.jvm.internal.o.f(substring, "substring(...)");
                                    arrayList.add(substring);
                                }
                                set = kz5.n0.X0(arrayList);
                            }
                            if (set == null) {
                                ra3.o oVar3 = new ra3.o(false, baseLibPath);
                                com.tencent.mars.xlog.Log.i("LiteAppHelper", "check_package_integrity " + baseLibPath + " Execution time: " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
                                return oVar3;
                            }
                            org.json.JSONArray jSONArray = new org.json.JSONObject(com.tencent.mm.vfs.w6.M(baseLibPath + "/signatures.json")).getJSONArray("signatures");
                            if (jSONArray == null) {
                                com.tencent.mars.xlog.Log.e("LiteAppHelper", "signatures json array not found.");
                                ra3.o oVar4 = new ra3.o(false, "signatures.json");
                                com.tencent.mars.xlog.Log.i("LiteAppHelper", "check_package_integrity " + baseLibPath + " Execution time: " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
                                return oVar4;
                            }
                            int length2 = jSONArray.length();
                            for (int i17 = 0; i17 < length2; i17++) {
                                java.lang.String string = jSONArray.getJSONObject(i17).getString("file");
                                if (!set.contains(string)) {
                                    com.tencent.mars.xlog.Log.e("LiteAppHelper", "File does not exist: " + string);
                                    kotlin.jvm.internal.o.d(string);
                                    ra3.o oVar5 = new ra3.o(false, string);
                                    com.tencent.mars.xlog.Log.i("LiteAppHelper", "check_package_integrity " + baseLibPath + " Execution time: " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
                                    return oVar5;
                                }
                            }
                            com.tencent.mars.xlog.Log.i("LiteAppHelper", "all File exist");
                            ra3.o oVar6 = new ra3.o(true, "");
                            com.tencent.mars.xlog.Log.i("LiteAppHelper", "check_package_integrity " + baseLibPath + " Execution time: " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
                            return oVar6;
                        } catch (java.io.IOException e17) {
                            com.tencent.mars.xlog.Log.e("LiteAppHelper", jz5.a.b(e17));
                            ra3.o oVar7 = new ra3.o(false, "IOException");
                            com.tencent.mars.xlog.Log.i("LiteAppHelper", "check_package_integrity " + baseLibPath + " Execution time: " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
                            return oVar7;
                        }
                    } catch (java.lang.Exception e18) {
                        com.tencent.mars.xlog.Log.e("LiteAppHelper", jz5.a.b(e18));
                        ra3.o oVar8 = new ra3.o(false, "Exception");
                        com.tencent.mars.xlog.Log.i("LiteAppHelper", "check_package_integrity " + baseLibPath + " Execution time: " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
                        return oVar8;
                    }
                } catch (org.json.JSONException e19) {
                    com.tencent.mars.xlog.Log.e("LiteAppHelper", jz5.a.b(e19));
                    ra3.o oVar9 = new ra3.o(false, "JSONException");
                    com.tencent.mars.xlog.Log.i("LiteAppHelper", "check_package_integrity " + baseLibPath + " Execution time: " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
                    return oVar9;
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.i("LiteAppHelper", "check_package_integrity " + baseLibPath + " Execution time: " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
                throw th6;
            }
        }
    }

    public final ra3.o b(java.lang.String packagePath) {
        kotlin.jvm.internal.o.g(packagePath, "packagePath");
        synchronized (this) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.util.Map map = ra3.p.f393526b;
            if (map.containsKey(packagePath)) {
                java.lang.Object obj = ((java.util.LinkedHashMap) map).get(packagePath);
                kotlin.jvm.internal.o.d(obj);
                if (currentTimeMillis - ((java.lang.Number) obj).longValue() < 500) {
                    com.tencent.mars.xlog.Log.i("LiteAppHelper", "packagePath:" + packagePath + " has recently check.");
                    return new ra3.o(true, "");
                }
            }
            map.put(packagePath, java.lang.Long.valueOf(currentTimeMillis));
            try {
                try {
                    try {
                        try {
                            com.tencent.mm.vfs.x1 m17 = com.tencent.mm.vfs.w6.m(packagePath);
                            java.util.Set set = null;
                            java.lang.String str = m17 != null ? m17.f213231a : null;
                            if (str == null) {
                                com.tencent.mars.xlog.Log.e("LiteAppHelper", "packageRelPath == null");
                                ra3.o oVar = new ra3.o(false, packagePath);
                                com.tencent.mars.xlog.Log.i("LiteAppHelper", "check_package_integrity " + packagePath + " Execution time: " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
                                return oVar;
                            }
                            int length = str.length() + 1;
                            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(packagePath.concat("/signatures.json"));
                            java.lang.String str2 = a17.f213279f;
                            if (str2 != null) {
                                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
                                if (!a17.f213279f.equals(l17)) {
                                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                                }
                            }
                            com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
                            if (!(!m18.a() ? false : m18.f213266a.F(m18.f213267b))) {
                                com.tencent.mars.xlog.Log.e("LiteAppHelper", "signatures not exist");
                                ra3.o oVar2 = new ra3.o(false, "signatures.json");
                                com.tencent.mars.xlog.Log.i("LiteAppHelper", "check_package_integrity " + packagePath + " Execution time: " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
                                return oVar2;
                            }
                            java.lang.Iterable s17 = com.tencent.mm.vfs.w6.s(packagePath, true);
                            if (s17 != null) {
                                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(s17, 10));
                                java.util.Iterator it = s17.iterator();
                                while (it.hasNext()) {
                                    java.lang.String relPath = ((com.tencent.mm.vfs.x1) it.next()).f213231a;
                                    kotlin.jvm.internal.o.f(relPath, "relPath");
                                    java.lang.String substring = relPath.substring(length);
                                    kotlin.jvm.internal.o.f(substring, "substring(...)");
                                    arrayList.add(substring);
                                }
                                set = kz5.n0.X0(arrayList);
                            }
                            if (set == null) {
                                ra3.o oVar3 = new ra3.o(false, packagePath);
                                com.tencent.mars.xlog.Log.i("LiteAppHelper", "check_package_integrity " + packagePath + " Execution time: " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
                                return oVar3;
                            }
                            org.json.JSONArray jSONArray = new org.json.JSONObject(com.tencent.mm.vfs.w6.M(packagePath + "/signatures.json")).getJSONArray("signatures");
                            if (jSONArray == null) {
                                com.tencent.mars.xlog.Log.e("LiteAppHelper", "signatures json array not found.");
                                ra3.o oVar4 = new ra3.o(false, "signatures.json");
                                com.tencent.mars.xlog.Log.i("LiteAppHelper", "check_package_integrity " + packagePath + " Execution time: " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
                                return oVar4;
                            }
                            int length2 = jSONArray.length();
                            for (int i17 = 0; i17 < length2; i17++) {
                                java.lang.String string = jSONArray.getJSONObject(i17).getString("file");
                                if (!set.contains(string)) {
                                    com.tencent.mars.xlog.Log.e("LiteAppHelper", "File does not exist: " + string);
                                    kotlin.jvm.internal.o.d(string);
                                    ra3.o oVar5 = new ra3.o(false, string);
                                    com.tencent.mars.xlog.Log.i("LiteAppHelper", "check_package_integrity " + packagePath + " Execution time: " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
                                    return oVar5;
                                }
                            }
                            com.tencent.mars.xlog.Log.i("LiteAppHelper", "all File exist");
                            ra3.o oVar6 = new ra3.o(true, "");
                            com.tencent.mars.xlog.Log.i("LiteAppHelper", "check_package_integrity " + packagePath + " Execution time: " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
                            return oVar6;
                        } catch (java.io.IOException e17) {
                            com.tencent.mars.xlog.Log.e("LiteAppHelper", jz5.a.b(e17));
                            ra3.o oVar7 = new ra3.o(false, "IOException");
                            com.tencent.mars.xlog.Log.i("LiteAppHelper", "check_package_integrity " + packagePath + " Execution time: " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
                            return oVar7;
                        }
                    } catch (java.lang.Exception e18) {
                        com.tencent.mars.xlog.Log.e("LiteAppHelper", jz5.a.b(e18));
                        ra3.o oVar8 = new ra3.o(false, "Exception");
                        com.tencent.mars.xlog.Log.i("LiteAppHelper", "check_package_integrity " + packagePath + " Execution time: " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
                        return oVar8;
                    }
                } catch (org.json.JSONException e19) {
                    com.tencent.mars.xlog.Log.e("LiteAppHelper", jz5.a.b(e19));
                    ra3.o oVar9 = new ra3.o(false, "JSONException");
                    com.tencent.mars.xlog.Log.i("LiteAppHelper", "check_package_integrity " + packagePath + " Execution time: " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
                    return oVar9;
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.i("LiteAppHelper", "check_package_integrity " + packagePath + " Execution time: " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
                throw th6;
            }
        }
    }
}
