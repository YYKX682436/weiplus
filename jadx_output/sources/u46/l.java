package u46;

/* loaded from: classes7.dex */
public abstract class l {
    public static boolean a(java.lang.String str, java.lang.String str2) {
        return (str == null || str2 == null || str.indexOf(str2) < 0) ? false : true;
    }

    public static boolean b(java.lang.String str, java.lang.String str2) {
        if (str == null || str2 == null) {
            return str == null && str2 == null;
        }
        if (str2.length() > str.length()) {
            return false;
        }
        return str.regionMatches(false, str.length() - str2.length(), str2, 0, str2.length());
    }

    public static boolean c(java.lang.String str, java.lang.String str2) {
        return str == null ? str2 == null : str.equals(str2);
    }

    public static boolean d(java.lang.String str, java.lang.String str2) {
        return str == null ? str2 == null : str.equalsIgnoreCase(str2);
    }

    public static boolean e(java.lang.String str) {
        return str == null || str.length() == 0;
    }

    public static boolean f(java.lang.String str) {
        boolean z17;
        int length;
        if (str != null && (length = str.length()) != 0) {
            z17 = false;
            for (int i17 = 0; i17 < length; i17++) {
                if (!java.lang.Character.isWhitespace(str.charAt(i17))) {
                    break;
                }
            }
        }
        z17 = true;
        return !z17;
    }

    public static boolean g(java.lang.String str) {
        return !e(str);
    }

    public static java.lang.String h(java.util.Collection collection, java.lang.String str) {
        if (collection == null) {
            return null;
        }
        return i(collection.iterator(), str);
    }

    public static java.lang.String i(java.util.Iterator it, java.lang.String str) {
        if (it == null) {
            return null;
        }
        if (!it.hasNext()) {
            return "";
        }
        java.lang.Object next = it.next();
        if (!it.hasNext()) {
            return next == null ? "" : next.toString();
        }
        x46.a aVar = new x46.a(256);
        if (next != null) {
            aVar.b(next);
        }
        while (it.hasNext()) {
            if (str != null) {
                aVar.c(str);
            }
            java.lang.Object next2 = it.next();
            if (next2 != null) {
                aVar.b(next2);
            }
        }
        return aVar.toString();
    }

    public static java.lang.String j(java.lang.Object[] objArr, char c17) {
        if (objArr == null) {
            return null;
        }
        int length = objArr.length;
        int i17 = length + 0;
        if (i17 <= 0) {
            return "";
        }
        java.lang.Object obj = objArr[0];
        x46.a aVar = new x46.a(i17 * ((obj == null ? 16 : obj.toString().length()) + 1));
        for (int i18 = 0; i18 < length; i18++) {
            if (i18 > 0) {
                aVar.a(c17);
            }
            java.lang.Object obj2 = objArr[i18];
            if (obj2 != null) {
                aVar.b(obj2);
            }
        }
        return aVar.toString();
    }

    public static java.lang.String k(java.lang.Object[] objArr, java.lang.String str) {
        if (objArr == null) {
            return null;
        }
        int length = objArr.length;
        if (str == null) {
            str = "";
        }
        int i17 = length + 0;
        if (i17 <= 0) {
            return "";
        }
        java.lang.Object obj = objArr[0];
        x46.a aVar = new x46.a(i17 * ((obj == null ? 16 : obj.toString().length()) + str.length()));
        for (int i18 = 0; i18 < length; i18++) {
            if (i18 > 0) {
                aVar.c(str);
            }
            java.lang.Object obj2 = objArr[i18];
            if (obj2 != null) {
                aVar.b(obj2);
            }
        }
        return aVar.toString();
    }

    public static java.lang.String l(java.lang.String str, int i17, char c17) {
        if (str == null) {
            return null;
        }
        int length = i17 - str.length();
        if (length <= 0) {
            return str;
        }
        if (length <= 8192) {
            return m(length, c17).concat(str);
        }
        java.lang.String valueOf = java.lang.String.valueOf(c17);
        if (e(valueOf)) {
            valueOf = " ";
        }
        int length2 = valueOf.length();
        int length3 = i17 - str.length();
        if (length3 <= 0) {
            return str;
        }
        if (length2 == 1 && length3 <= 8192) {
            return l(str, i17, valueOf.charAt(0));
        }
        if (length3 == length2) {
            return valueOf.concat(str);
        }
        if (length3 < length2) {
            return valueOf.substring(0, length3).concat(str);
        }
        char[] cArr = new char[length3];
        char[] charArray = valueOf.toCharArray();
        for (int i18 = 0; i18 < length3; i18++) {
            cArr[i18] = charArray[i18 % length2];
        }
        return new java.lang.String(cArr).concat(str);
    }

    public static java.lang.String m(int i17, char c17) {
        if (i17 < 0) {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Cannot pad a negative amount: ");
            stringBuffer.append(i17);
            throw new java.lang.IndexOutOfBoundsException(stringBuffer.toString());
        }
        char[] cArr = new char[i17];
        for (int i18 = 0; i18 < i17; i18++) {
            cArr[i18] = c17;
        }
        return new java.lang.String(cArr);
    }

    public static java.lang.String n(java.lang.String str, java.lang.String str2) {
        return (e(str) || e(str2) || !str.endsWith(str2)) ? str : str.substring(0, str.length() - str2.length());
    }

    public static java.lang.String o(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (e(str) || e(str2) || str3 == null) {
            return str;
        }
        int i17 = 0;
        int indexOf = str.indexOf(str2, 0);
        if (indexOf == -1) {
            return str;
        }
        int length = str2.length();
        int length2 = str3.length() - length;
        if (length2 < 0) {
            length2 = 0;
        }
        x46.a aVar = new x46.a(str.length() + (length2 * 16));
        int i18 = -1;
        while (indexOf != -1) {
            aVar.c(str.substring(i17, indexOf)).c(str3);
            i17 = indexOf + length;
            i18--;
            if (i18 == 0) {
                break;
            }
            indexOf = str.indexOf(str2, i17);
        }
        aVar.c(str.substring(i17));
        return aVar.toString();
    }

    public static java.lang.String[] p(java.lang.String str, char c17) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return u46.a.f424657b;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 0;
        boolean z17 = false;
        int i18 = 0;
        while (i17 < length) {
            if (str.charAt(i17) == c17) {
                if (z17) {
                    arrayList.add(str.substring(i18, i17));
                    z17 = false;
                }
                i18 = i17 + 1;
                i17 = i18;
            } else {
                i17++;
                z17 = true;
            }
        }
        if (z17) {
            arrayList.add(str.substring(i18, i17));
        }
        return (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]);
    }

    public static java.lang.String[] q(java.lang.String str, java.lang.String str2) {
        int i17;
        boolean z17;
        int i18;
        int i19;
        boolean z18;
        int i27;
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return u46.a.f424657b;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (str2 == null) {
            int i28 = 1;
            i19 = 0;
            z18 = false;
            i27 = 0;
            while (i19 < length) {
                if (java.lang.Character.isWhitespace(str.charAt(i19))) {
                    if (z18) {
                        int i29 = i28 + 1;
                        if (i28 == -1) {
                            i19 = length;
                        }
                        arrayList.add(str.substring(i27, i19));
                        i28 = i29;
                        z18 = false;
                    }
                    i27 = i19 + 1;
                    i19 = i27;
                } else {
                    i19++;
                    z18 = true;
                }
            }
        } else {
            if (str2.length() == 1) {
                char charAt = str2.charAt(0);
                int i37 = 1;
                i17 = 0;
                z17 = false;
                i18 = 0;
                while (i17 < length) {
                    if (str.charAt(i17) == charAt) {
                        if (z17) {
                            int i38 = i37 + 1;
                            if (i37 == -1) {
                                i17 = length;
                            }
                            arrayList.add(str.substring(i18, i17));
                            i37 = i38;
                            z17 = false;
                        }
                        i18 = i17 + 1;
                        i17 = i18;
                    } else {
                        i17++;
                        z17 = true;
                    }
                }
            } else {
                int i39 = 1;
                i17 = 0;
                z17 = false;
                i18 = 0;
                while (i17 < length) {
                    if (str2.indexOf(str.charAt(i17)) >= 0) {
                        if (z17) {
                            int i47 = i39 + 1;
                            if (i39 == -1) {
                                i17 = length;
                            }
                            arrayList.add(str.substring(i18, i17));
                            i39 = i47;
                            z17 = false;
                        }
                        i18 = i17 + 1;
                        i17 = i18;
                    } else {
                        i17++;
                        z17 = true;
                    }
                }
            }
            i19 = i17;
            z18 = z17;
            i27 = i18;
        }
        if (z18) {
            arrayList.add(str.substring(i27, i19));
        }
        return (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]);
    }

    public static boolean r(java.lang.String str, java.lang.String str2) {
        if (str == null || str2 == null) {
            return str == null && str2 == null;
        }
        if (str2.length() > str.length()) {
            return false;
        }
        return str.regionMatches(false, 0, str2, 0, str2.length());
    }

    public static java.lang.String s(java.lang.String str, int i17) {
        if (str == null) {
            return null;
        }
        if (i17 < 0) {
            i17 += str.length();
        }
        if (i17 < 0) {
            i17 = 0;
        }
        return i17 > str.length() ? "" : str.substring(i17);
    }

    public static java.lang.String t(java.lang.String str, int i17, int i18) {
        if (str == null) {
            return null;
        }
        if (i18 < 0) {
            i18 += str.length();
        }
        if (i17 < 0) {
            i17 += str.length();
        }
        if (i18 > str.length()) {
            i18 = str.length();
        }
        if (i17 > i18) {
            return "";
        }
        if (i17 < 0) {
            i17 = 0;
        }
        if (i18 < 0) {
            i18 = 0;
        }
        return str.substring(i17, i18);
    }

    public static java.lang.String u(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return str.trim();
    }
}
